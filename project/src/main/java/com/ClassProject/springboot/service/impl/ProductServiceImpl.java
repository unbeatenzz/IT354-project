package com.ClassProject.springboot.service.impl;

import com.ClassProject.springboot.mapper.ProductMapper;
import com.ClassProject.springboot.model.Product;
import com.ClassProject.springboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper productMapper;

    @Override
    public List<Product> searchByInfo(String info) {

        List<Product> list = productMapper.selectProductByInfo(info);

        return list;
    }

    @Override
    public Product selectByPrimaryKey(int id) {
        return productMapper.selectByPrimaryKey(id);
    }
}
