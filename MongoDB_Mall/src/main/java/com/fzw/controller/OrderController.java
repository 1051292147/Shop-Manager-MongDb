package com.fzw.controller;

import com.fzw.entity.Order;

import com.fzw.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("order")
public class OrderController {

    //注入Service
    @Autowired
    private OrderService orderService;

    //显示所有订单信息
    @RequestMapping("/show")
    public ModelAndView show(ModelAndView view){
        List<Order> orderList = orderService.findAll();
        //将获取的订单信息集合存储到orderList，用于页面获取
        view.addObject("orderList",orderList);
        view.setViewName("order-show");
        return view;
    }
    //添加订单
    @RequestMapping("/add")
    public String add(Order order){
        orderService.add(order);
        return "redirect:/order/show";
    }
    //跳转至添加订单界面
    @GetMapping("/addOrder")
    public String addorder(){
        return "order-add";
    }
    //跳转至更新订单信息界面
    @RequestMapping("/toUpdate/{id}")
    public String toUpdateorder(Model model, @PathVariable String id){
        //先获取到要修改的订单信息
        Order order = orderService.findId(id);
        model.addAttribute("order",order);
        return "order-update";
    }
    //更新订单
    @RequestMapping("/updateOrder")
    public String updateorder(Order order){
        orderService.update(order);
        return "redirect:/order/show";
    }
    //删除订单
    @RequestMapping("/toDelete/{id}")
    public String toDelete(Model model, @PathVariable String id){
        orderService.delete(id);
        return "redirect:/order/show";
    }
}
