package com.ClassProject.springboot.service.impl;

import com.ClassProject.springboot.mapper.CartItemMapper;
import com.ClassProject.springboot.model.CartItem;
import com.ClassProject.springboot.service.CartItemService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartItemServiceImpl implements CartItemService {

    @Autowired private CartItemMapper cartItemMapper;

    @Override
    public List<CartItem> getCartItemsByCid(int cid) {
        List<CartItem> cartItems = cartItemMapper.getCartItemsByCid(cid);
        for (CartItem c:
             cartItems) {
            System.out.println(c.getImage());
        }
        return cartItems;
    }

    @Override
    public int deleteByPrimaryKey(int id) {
        return cartItemMapper.deleteByPrimaryKey(id);
    }

    @Override
    public CartItem getCartItemByCid(@Param("cid") int cid, @Param("pid") int pid) {
        CartItem cartItem = cartItemMapper.getCartItemByCid(cid,pid);
        System.out.println("cid service = "+ cid);
        System.out.println("pid service = "+ pid);
        return cartItem;
    }

    @Override
    public int updateByPrimaryKey(CartItem cartItem) {

        return cartItemMapper.updateByPrimaryKey(cartItem);
    }

    @Override
    public int insertCartItem(CartItem c) {

        return cartItemMapper.insert(c);
    }

    @Override
    public int checkout(int uid) {
        return cartItemMapper.checkout(uid);
    }
}
