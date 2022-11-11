package com.example.bsaleapi.service;

import com.example.bsaleapi.model.Category;

import java.util.ArrayList;
import java.util.Optional;

public interface CategoryService {
    ArrayList<Category> getAllCategory();
    Optional<Category> getCategoryById(int id);
}
