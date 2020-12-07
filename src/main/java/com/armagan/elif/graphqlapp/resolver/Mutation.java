package com.armagan.elif.graphqlapp.resolver;

import com.armagan.elif.graphqlapp.model.Category;
import com.armagan.elif.graphqlapp.repository.CategoryRepository;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;

public class Mutation implements GraphQLMutationResolver {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category createCategory(String name){
        Category category = new Category();
        category.setName(name);
        return categoryRepository.save(category);
    }

}
