package com.ClassProject.springboot.service;

import com.ClassProject.springboot.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    List<Product> searchByInfo(String info);

    Product selectByPrimaryKey(int id);

}
