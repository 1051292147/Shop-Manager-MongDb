package com.fzw.service;


import com.fzw.entity.Product;

import java.util.List;

public interface ProductService {
   public List<Product> findAll();
   public void add(Product product);
   public Product findId(String id);
   public void delete(String id);
   public void update(Product product);

}
