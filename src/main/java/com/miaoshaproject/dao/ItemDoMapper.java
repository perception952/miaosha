package com.miaoshaproject.dao;

import com.miaoshaproject.dataobject.ItemDo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItemDoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ItemDo record);

    int insertSelective(ItemDo record);

    List<ItemDo> listItem();

    ItemDo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ItemDo record);

    int updateByPrimaryKey(ItemDo record);

    int increaseSales(@Param("id") Integer id, @Param("amount") Integer amount);
}