package com.fzw.dao;

import com.fzw.entity.Order;
import com.fzw.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDaoImpl implements OrderDao{

    //注入MongoTemplate
    @Autowired
    private MongoTemplate mongoTemplate;

    //查询所有订单
    @Override
    public List<Order> findAll() {
        List<Order> orderList = mongoTemplate.findAll(Order.class);
        return orderList;
    }
    //添加订单
    @Override
    public void add(Order order) {
        mongoTemplate.insert(order);
    }

    //根据ID查询订单
    @Override
    public Order findId(String id) {
        return mongoTemplate.findById(id, Order.class);
    }

    //删除订单
    @Override
    public void delete(String id) {
        //查询条件是ID相等
        Query query = new Query(Criteria.where("id").is(id));
        mongoTemplate.remove(query, Order.class);
    }

    //更新订单信息
    @Override
    public void update(Order order) {
        //查询条件是id相等
        Query query = new Query(Criteria.where("_id").is(order.getId()));
        //将更新界面传入的order对象中的值作为更新的条件
        Update update=new Update();
        update.set("orderId",order.getOrderId());
        update.set("totalPay",order.getTotalPay());
        update.set("actualPay",order.getActualPay());
        update.set("paymentTypeStatus",order.getPaymentTypeStatus());
        update.set("createTime",order.getCreateTime());
        update.set("receiverAddress",order.getReceiverAddress());
        update.set("receiverMobile",order.getReceiverMobile());
        update.set("receiver",order.getReceiver());

        mongoTemplate.updateFirst(query,update,Order.class);
    }
}
