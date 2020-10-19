package com.adrianscorus.sprinbootlesson3.service;

import com.adrianscorus.sprinbootlesson3.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void addProduct(String name){
        productRepository.addProduct(name);

    }
}
