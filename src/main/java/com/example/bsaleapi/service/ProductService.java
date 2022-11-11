package com.example.bsaleapi.service;

import com.example.bsaleapi.model.Product;

import java.util.ArrayList;
import java.util.Optional;

public interface ProductService {
    ArrayList<Product> getAllProduct();
    Optional<Product> getProductById(int id);
}
