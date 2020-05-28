package com.fzw.dao;

import com.fzw.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    //查询所有的商品信息
    @Override
    public List<Product> findAll() {
        List<Product> productList = mongoTemplate.findAll(Product.class);
        return productList;//mongoTemplate.find;
    }

    //添加商品
    @Override
    public void add(Product product) {
        mongoTemplate.insert(product);
    }

    //根据ID查询商品
    @Override
    public Product findId(String id) {
        return mongoTemplate.findById(id,Product.class);
    }

    //删除商品
    @Override
    public void delete(String id) {
        Query query = new Query(Criteria.where("id").is(id));
        mongoTemplate.remove(query,Product.class);

    }

    //更新商品
    @Override
    public void update(Product product) {
        Query query = new Query(Criteria.where("id").is(product.getId()));
        Update update=new Update();
        update.set("productId",product.getProductId());
        update.set("productName",product.getProductName());
        update.set("productCaption",product.getProductCaption());
        update.set("salePrice",product.getSalePrice());
        update.set("productImageUrl",product.getProductImageUrl());

        mongoTemplate.updateFirst(query,update,Product.class);
    }


}
