package com.ClassProject.springboot.controller;

import com.ClassProject.springboot.model.Cart;
import com.ClassProject.springboot.model.CartItem;
import com.ClassProject.springboot.model.Product;
import com.ClassProject.springboot.service.CartItemService;
import com.ClassProject.springboot.service.CartService;
import com.ClassProject.springboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CartController {

    @Autowired private ProductService productService;
    @Autowired private CartService cartService;
    @Autowired private CartItemService cartItemService;

    @RequestMapping("/cartIndex")
    public String cartIndex(Model model, @RequestParam() int uid){

        List<CartItem> list = cartItemService.getCartItemsByCid(uid);
        System.out.println("list is "+list.isEmpty());
        for (CartItem c:
             list) {
            System.out.println(c.getItemtitle());
        }
        model.addAttribute("cartitems",list);
        return "cart";
    }

    @RequestMapping("/cart/deleteCartItem")
    public String deleteCartItem(@RequestParam int id, @RequestParam int uid){
        cartItemService.deleteByPrimaryKey(id);
        return "redirect:/cartIndex?uid="+uid;
    }

    @RequestMapping("/cart/addCartItem")
    public String addCartItem(@RequestParam() int cid, @RequestParam() int pid){
        CartItem cartItemByCid = cartItemService.getCartItemByCid(cid, pid);
        if(cartItemByCid!=null){
            int q = cartItemByCid.getProductquantity();
            q += 1;
            cartItemByCid.setProductquantity(q);
            cartItemService.updateByPrimaryKey(cartItemByCid);
        }else{
            Product product = productService.selectByPrimaryKey(pid);
            CartItem c = new CartItem();
            c.setId(0);
            c.setProductid(product.getPid());
            c.setCartid(cid);
            c.setProductquantity(1);
            c.setImage(product.getImage());
            c.setVal(product.getPrice());
            c.setItemTitle(product.getTitle());
            cartItemService.insertCartItem(c);
        }
        return "redirect:/product/search";
    }

    @RequestMapping("/cart/checkout")
    public String cartCheckOut(@RequestParam() int uid){
        cartItemService.checkout(uid);
        return "redirect:/cartIndex?uid="+uid;
    }

}
