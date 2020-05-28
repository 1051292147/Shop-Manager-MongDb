package com.fzw.controller;

import com.fzw.entity.LoggerEntity;
import com.fzw.entity.Order;
import com.fzw.service.LogService;
import com.fzw.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("log")
public class LogController {

    @Autowired
    private LogService logService;

    @RequestMapping("/show")
    public ModelAndView show(ModelAndView view){
        List<LoggerEntity> logList = logService.findAll();
        view.addObject("logList",logList);
        view.setViewName("log-show");
        return view;
    }
}
