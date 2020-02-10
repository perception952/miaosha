package com.miaoshaproject.service.model;

import lombok.Data;
import org.joda.time.DateTime;

import java.math.BigDecimal;

@Data
public class PromoModel {

    private Integer id;

    //秒杀活动状态 0还未开始 1进行中 2已结束
    private Integer status;

    private String promoName;

    private DateTime startDate;

    private DateTime endDate;

    //秒杀活动的使用商品
    private Integer itemId;

    //秒杀活动的商品价格
    private BigDecimal promoItemPrice;
}
