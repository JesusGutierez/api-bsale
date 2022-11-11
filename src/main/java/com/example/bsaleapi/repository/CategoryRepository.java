package com.example.bsaleapi.repository;

import com.example.bsaleapi.model.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CategoryRepository extends CrudRepository<Category, Integer> {
}
