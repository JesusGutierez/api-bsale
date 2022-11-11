package com.example.bsaleapi.service;

import com.example.bsaleapi.model.Category;
import com.example.bsaleapi.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public ArrayList<Category> getAllCategory() {
        return (ArrayList<Category>) categoryRepository.findAll();
    }

    @Override
    public Optional<Category> getCategoryById(int id) {
        return categoryRepository.findById(id);
    }
}
