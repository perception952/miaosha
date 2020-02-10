package com.miaoshaproject.service.model;

import lombok.Data;

import java.math.BigDecimal;

//用户下单的交易模型
@Data
public class OrderModel {

    private String id;

    private Integer userId;

    private Integer itemId;

    //若非空则表示是以秒杀商品方式下单
    private Integer promoId;

    //购买物品的单价，若promoId非空，则表示秒删商品价格
    private BigDecimal itemPrice;

    private Integer amount;

    private BigDecimal orderPrice;

}
