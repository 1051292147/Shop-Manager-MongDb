package com.fzw.service;

import com.fzw.dao.ProductDaoImpl;
import com.fzw.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductDaoImpl productDao;


    @Override
    public List<Product> findAll() {
        return productDao.findAll();
    }

    @Override
    public void add(Product product) {
        productDao.add(product);
    }

    @Override
    public Product findId(String id) {
        return productDao.findId(id);
    }

    @Override
    public void delete(String id) {
        productDao.delete(id);
    }

    @Override
    public void update(Product product) {
        productDao.update(product);
    }


}
