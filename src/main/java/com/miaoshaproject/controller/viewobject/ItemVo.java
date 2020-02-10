package com.miaoshaproject.controller.viewobject;

import lombok.Data;
import org.joda.time.DateTime;

import java.math.BigDecimal;

@Data
public class ItemVo {
    private Integer id;
    private String title;
    private BigDecimal price;
    private Integer stock;
    private String description;
    private Integer sales;
    private String imgUrl;
    //商品是否在秒杀活动中,以及对应状态:0表示没有秒杀活动 1秒杀活动待开始 2秒杀活动进行中
    private Integer promoStatus;

    //秒杀活动价格
    private BigDecimal promoPrice;

    //秒杀活动ID
    private Integer promoId;

    //秒杀活动开始时间
    private String startDate;

}
