package com.ClassProject.springboot.service;


import com.ClassProject.springboot.model.Cart;
import com.ClassProject.springboot.model.CartItem;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CartService {

    Cart getCartByUid(int uid);

    List<CartItem> getCartItems(int cid);
}
