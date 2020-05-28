package com.fzw.service;

import com.fzw.dao.OrderDaoImpl;
import com.fzw.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderDaoImpl orderService;
    //查询所有订单信息
    @Override
    public List<Order> findAll() {
        return orderService.findAll();
    }

    //添加订单
    @Override
    public void add(Order order) {
        orderService.add(order);
    }

    //根据ID查询订单
    @Override
    public Order findId(String id) {
        return orderService.findId(id);
    }

    //删除订单
    @Override
    public void delete(String id) {
        orderService.delete(id);
    }

    //更新订单
    @Override
    public void update(Order order) {
        orderService.update(order);
    }
}
