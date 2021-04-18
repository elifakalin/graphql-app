package com.armagan.elif.graphqlapp.service;

import com.armagan.elif.graphqlapp.model.Category;
import com.armagan.elif.graphqlapp.repository.CategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category save(String name) {
        Category category = new Category();
        category.setName(name);
        return categoryRepository.save(category);
    }
}
