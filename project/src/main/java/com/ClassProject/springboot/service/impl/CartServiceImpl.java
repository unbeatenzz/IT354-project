package com.ClassProject.springboot.service.impl;

import com.ClassProject.springboot.mapper.CartMapper;
import com.ClassProject.springboot.model.Cart;
import com.ClassProject.springboot.model.CartItem;
import com.ClassProject.springboot.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    @Autowired CartMapper cartMapper;


    @Override
    public Cart getCartByUid(int uid) {
        Cart c = cartMapper.selectByUid(uid);
        return c;
    }

    @Override
    public List<CartItem> getCartItems(int cid) {
        List<CartItem> cartItems = cartMapper.selectCartItems(cid);

        return cartItems;
    }
}
