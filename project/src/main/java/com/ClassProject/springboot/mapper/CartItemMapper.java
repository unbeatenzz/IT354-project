package com.ClassProject.springboot.mapper;

import com.ClassProject.springboot.model.CartItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CartItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CartItem record);

    int insertSelective(CartItem record);

    CartItem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CartItem record);

    int updateByPrimaryKey(CartItem record);

    List<CartItem> getCartItemsByCid(int cid);

    CartItem getCartItemByCid(int cid, int pid);

    int checkout(int uid);
}