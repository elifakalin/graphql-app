package com.armagan.elif.graphqlapp.resolver;

import com.armagan.elif.graphqlapp.model.Campaign;
import com.armagan.elif.graphqlapp.model.Category;
import com.armagan.elif.graphqlapp.model.Product;
import com.armagan.elif.graphqlapp.repository.*;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Query implements GraphQLQueryResolver {

    @Autowired
    private CampaignRepository campaignRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private MemberRepository memberRepository;

    public List<Product> getProducts(){
        return productRepository.findAll();
    }
    public List<Category> getCategories(){
        return categoryRepository.findAll();
    }

    public List<Product> getProductsByCategoryId(Long categoryId){
        return productRepository.getProductByCategoryId(categoryId);
    }

    public List<Product> getProductsByCampaignId(Long campaignId){
        return productRepository.getProductByCampaignId(campaignId);
    }

    public List<Campaign> getCampaigns(){
        return campaignRepository.findAll();
    }
}
