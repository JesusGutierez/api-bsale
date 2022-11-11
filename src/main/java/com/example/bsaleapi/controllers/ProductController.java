package com.example.bsaleapi.controllers;

import com.example.bsaleapi.model.Product;
import com.example.bsaleapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/saludar")
    public String saludar(){
        return "Hola mundo";
    }

    @GetMapping("/all")
    public ArrayList<Product> getAllProduct(){
        return productService.getAllProduct();
    }

    @GetMapping("/find/{id}")
    public Optional<Product> getProductById(@PathVariable("id") int id){
        return productService.getProductById(id);
    }
}
