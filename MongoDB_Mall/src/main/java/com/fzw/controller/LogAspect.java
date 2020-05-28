package com.fzw.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fzw.entity.LoggerEntity;
import com.fzw.service.LogService;
import com.fzw.utils.LoggerUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
 

@Aspect
@Component
 
public class LogAspect {

    @Autowired
    private LogService logService;

	private final static Logger logger = LoggerFactory.getLogger(LogAspect.class);
   
	

    ThreadLocal<LoggerEntity> loggerEntityThreadLocal = new ThreadLocal<LoggerEntity>();
   
    

    /**
     * 定义一个切入点.

     */
     @Pointcut("execution(public * com.fzw.controller..*.*(..))")
     public void webLog(){}
     
     /** 
      * 前置通知，方法调用前被调用 
      * @param joinPoint 
      */  
     @Before("webLog()")
     public void doBefore(JoinPoint joinPoint){
    	 
        
       // 接收到请求，记录请求内容
        logger.info("WebLogAspect.doBefore()");
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        //创建日志实体
        LoggerEntity logger = new LoggerEntity();
        //请求开始时间
        logger.setStartTime(System.currentTimeMillis());
        //获取请求sessionId
        String sessionId = request.getRequestedSessionId();
        //请求路径
        String url = request.getRequestURI();
        //获取请求参数信息
        String paramData = JSON.toJSONString(request.getParameterMap(),SerializerFeature.DisableCircularReferenceDetect,SerializerFeature.WriteMapNullValue);
        //设置客户端ip
        logger.setClientIp(LoggerUtils.getCliectIp(request));
        //设置请求方法
        logger.setMethod(request.getMethod());
        //设置请求类型（json|普通请求）
        logger.setType(LoggerUtils.getRequestType(request));
        //设置请求地址
        logger.setUri(url);
        //设置sessionId
        logger.setSessionId(sessionId);
        //请求的类及名称
        logger.setClassMethod(joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        //设置请求参数内容json字符串
        logger.setParamData(paramData);
        loggerEntityThreadLocal.set(logger);
        
     }
     

     @AfterReturning(value = "webLog()",returning = "returnData")
     public void  doAfterReturning(JoinPoint joinPoint,Object returnData){
       // 处理完请求，返回内容
        logger.info("WebLogAspect.doAfterReturning()");
        logger.info("RETURN DATA:"+ returnData);
        
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
//        HttpServletRequest request = attributes.getRequest();
        HttpServletResponse response = attributes.getResponse();
        
        //获取请求错误码
        int status = response.getStatus();
        //获取本次请求日志实体
        LoggerEntity loggerEntity = loggerEntityThreadLocal.get();
        //请求结束时间
        loggerEntity.setEndTime(System.currentTimeMillis());
        //设置请求时间差
        loggerEntity.setTimeConsuming(Integer.valueOf((loggerEntity.getEndTime() - loggerEntity.getStartTime())+""));
        //设置返回时间
        loggerEntity.setReturnTime(loggerEntity.getEndTime() + "");
        //设置返回错误码
        loggerEntity.setHttpStatusCode(status+"");
        //设置返回值
        loggerEntity.setReturnData(JSON.toJSONString(returnData,SerializerFeature.DisableCircularReferenceDetect,SerializerFeature.WriteMapNullValue));
        logger.info(JSON.toJSONString(loggerEntity));
        //将日志写入数据库
         logService.addLog(loggerEntity);

        
     }
     
     

     @AfterThrowing(value = "webLog()",throwing = "exception")  
     public void doAfterThrowingAdvice(JoinPoint joinPoint,Throwable exception) {
         LoggerEntity loggerEntity = loggerEntityThreadLocal.get();
         loggerEntity.setExceptionMessage(exception.getMessage());
         logger.info(JSON.toJSONString(loggerEntity));
     }
     
}