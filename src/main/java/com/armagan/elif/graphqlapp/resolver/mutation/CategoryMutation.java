package com.armagan.elif.graphqlapp.resolver.mutation;

import com.armagan.elif.graphqlapp.model.Category;
import com.armagan.elif.graphqlapp.service.CategoryService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;

@Component
public class CategoryMutation implements GraphQLMutationResolver {

    private final CategoryService categoryService;

    public CategoryMutation(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    public Category createCategory(String name){
        return categoryService.save(name);
    }
}
