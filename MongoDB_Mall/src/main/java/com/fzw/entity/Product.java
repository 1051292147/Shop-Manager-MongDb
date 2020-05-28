package com.fzw.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection="products")
public class Product {
    @Id
    private String id;
    private String productId;
    private String productName;
    private String productCaption;
    private Double salePrice;
    private String productImageUrl;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCaption() {
        return productCaption;
    }

    public void setProductCaption(String productCaption) {
        this.productCaption = productCaption;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public String getProductImageUrl() {
        return productImageUrl;
    }

    public void setProductImageUrl(String productImageUrl) {
        this.productImageUrl = productImageUrl;
    }

    public Product(String id, String productId, String productName, String productCaption, Double salePrice, String productImageUrl) {

        this.id = id;
        this.productId = productId;
        this.productName = productName;
        this.productCaption = productCaption;
        this.salePrice = salePrice;
        this.productImageUrl = productImageUrl;

    }

    public Product() {
    }


    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", productCaption='" + productCaption + '\'' +
                ", salePrice=" + salePrice +
                ", productImageUrl='" + productImageUrl + '\'' +
                '}';
    }
}
