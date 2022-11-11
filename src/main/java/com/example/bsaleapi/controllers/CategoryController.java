package com.example.bsaleapi.controllers;

import com.example.bsaleapi.model.Category;
import com.example.bsaleapi.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("categories")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping("/all")
    public ArrayList<Category> getAllCategory(){
        return categoryService.getAllCategory();
    }

    @GetMapping("/find/{id}")
    public Optional<Category> getCategoryById(@PathVariable("id") int id){
        return categoryService.getCategoryById(id);
    }

}
