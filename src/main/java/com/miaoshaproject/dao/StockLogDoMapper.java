package com.miaoshaproject.dao;

import com.miaoshaproject.dataobject.StockLogDo;

public interface StockLogDoMapper {
    int deleteByPrimaryKey(String stockLogId);

    int insert(StockLogDo record);

    int insertSelective(StockLogDo record);

    StockLogDo selectByPrimaryKey(String stockLogId);

    int updateByPrimaryKeySelective(StockLogDo record);

    int updateByPrimaryKey(StockLogDo record);
}