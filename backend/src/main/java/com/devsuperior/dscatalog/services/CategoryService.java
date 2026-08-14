package com.devsuperior.dscatalog.services;

import com.devsuperior.dscatalog.entities.CategoryEntity;
import com.devsuperior.dscatalog.repositoy.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {


    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<CategoryEntity> findAll() {
        return categoryRepository.findAll();
    }
}
