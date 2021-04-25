package com.ClassProject.springboot.controller;

import com.ClassProject.springboot.model.Product;
import com.ClassProject.springboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController {

    @Autowired private ProductService productService;

    @RequestMapping("/product/search")
    public String productSearch(Model model, @RequestParam(defaultValue = "") String info){
        List<Product> products = productService.searchByInfo(info);
        System.out.println(products.isEmpty());
        for(Product p:products){
            System.out.println(p.getDescription());
        }
        model.addAttribute("products",products);
        System.out.println(info);
        return "products";
    }

}
