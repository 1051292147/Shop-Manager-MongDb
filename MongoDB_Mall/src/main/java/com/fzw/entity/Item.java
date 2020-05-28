package com.fzw.entity;

import lombok.Data;

@Data
public class Item {

    Long id;


    String title;//标题

    String category;// 分类

    String brand; // 品牌

    Double price; // 价格

    String images; // 图片地址


}