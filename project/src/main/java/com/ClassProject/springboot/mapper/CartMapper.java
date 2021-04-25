package com.ClassProject.springboot.mapper;

import com.ClassProject.springboot.model.Cart;
import com.ClassProject.springboot.model.CartItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface CartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cart record);

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);

    Cart selectByUid(Integer uid);

    List<CartItem> selectCartItems(int cid);
}