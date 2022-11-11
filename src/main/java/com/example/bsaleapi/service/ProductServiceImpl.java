package com.example.bsaleapi.service;

import com.example.bsaleapi.model.Product;
import com.example.bsaleapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductRepository productRepository;

    @Override
    public ArrayList<Product> getAllProduct() {
        return (ArrayList<Product>) productRepository.findAll();
    }

    @Override
    public Optional<Product> getProductById(int id) {
        return productRepository.findById(id);
    }
}
