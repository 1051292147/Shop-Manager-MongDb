package com.fzw.controller;


import com.fzw.entity.Product;
import com.fzw.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    //注入service
    @Autowired
    private ProductServiceImpl productService;

    //显示所有商品
   @RequestMapping("/show")
    public ModelAndView show(ModelAndView view){
       List<Product> productList = productService.findAll();
       //将获取的product集合数据存入“productList”用于界面获取
       view.addObject("productList",productList);
       view.setViewName("product-show");
        return view;
   }
   //添加商品
   @RequestMapping("/add")
   public String add(Product product){
        productService.add(product);
       return "redirect:/product/show";
   }

   //跳转至添加页面
   @GetMapping("/addProduct")
    public String addProduct(){
       return "product-add";
   }

   //跳转至更新商品界面
    @RequestMapping("/toUpdate/{id}")
    public String toUpdateProduct(Model model, @PathVariable String id){
       //获取到此ID匹配的商品信息，在修改页面渲染
        Product product = productService.findId(id);
        model.addAttribute("product",product);
        return "product-update";
    }
    //更新商品
    @RequestMapping("/updateProduct")
    public String updateProduct(Product product){
        productService.update(product);
        return "redirect:/product/show";
    }

    //删除商品
    @RequestMapping("/toDelete/{id}")
    public String toDelete(Model model, @PathVariable String id){
      productService.delete(id);
        return "redirect:/product/show";
    }

}
