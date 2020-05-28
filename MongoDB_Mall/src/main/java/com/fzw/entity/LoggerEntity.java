package com.fzw.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Timestamp;

@Document("productLog")
public class LoggerEntity{

	//编号
    @Id
    private String id;
    //客户端请求ip
    private String clientIp;
    //客户端请求路径
    private String uri;
    //终端请求方式,普通请求,ajax请求
    private String type;
    //请求方式method,post,get等
    private String method;
    //请求的类及方法
    private String classMethod;
    //请求参数内容,json
    private String paramData;
    //请求接口唯一session标识
    private String sessionId;
    //请求时间
    private Timestamp time;
    //接口返回时间
    private String returnTime;
    //接口返回数据json
    private String returnData;
    //请求时httpStatusCode代码，如：200,400,404等
    private String httpStatusCode;
    //请求耗时秒单位
    private int timeConsuming;
    //异常描述
    private String exceptionMessage;
    //请求开始时间
    private long startTime;
    //请求结束时间
    private long endTime;
    
    


	public String getExceptionMessage() {
		return exceptionMessage;
	}

	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}

	public String getClassMethod() {
		return classMethod;
	}

	public void setClassMethod(String classMethod) {
		this.classMethod = classMethod;
	}

	public long getStartTime() {
		return startTime;
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}

	public long getEndTime() {
		return endTime;
	}

	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getParamData() {
        return paramData;
    }

    public void setParamData(String paramData) {
        this.paramData = paramData;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public String getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(String returnTime) {
        this.returnTime = returnTime;
    }

    public String getReturnData() {
        return returnData;
    }

    public void setReturnData(String returnData) {
        this.returnData = returnData;
    }

    public String getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    public int getTimeConsuming() {
        return timeConsuming;
    }

    public void setTimeConsuming(int timeConsuming) {
        this.timeConsuming = timeConsuming;
    }

	@Override
	public String toString() {
		return "LoggerEntity [id=" + id + ", clientIp=" + clientIp + ", uri=" + uri + ", type=" + type + ", method="
				+ method + ", classMethod=" + classMethod + ", paramData=" + paramData + ", sessionId=" + sessionId
				+ ", time=" + time + ", returnTime=" + returnTime + ", returnData=" + returnData + ", httpStatusCode="
				+ httpStatusCode + ", timeConsuming=" + timeConsuming + ", exceptionMessage=" + exceptionMessage + ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}
    
    
}