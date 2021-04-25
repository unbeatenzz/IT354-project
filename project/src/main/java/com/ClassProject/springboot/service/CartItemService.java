package com.ClassProject.springboot.service;

import com.ClassProject.springboot.model.CartItem;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CartItemService {
    List<CartItem> getCartItemsByCid(int cid);

    int deleteByPrimaryKey(int id);

    CartItem getCartItemByCid(@Param("cid") int cid, @Param("pid") int pid);

    int updateByPrimaryKey(CartItem cartItem);

    int insertCartItem(CartItem c);

    int checkout(int uid);
}
