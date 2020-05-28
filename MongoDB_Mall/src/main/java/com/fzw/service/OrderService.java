package com.fzw.service;

import com.fzw.entity.Order;

import java.util.List;

public interface OrderService {
    public List<Order> findAll();
    public void add(Order order);
    public Order findId(String id);
    public void delete(String id);
    public void update(Order order);
}
