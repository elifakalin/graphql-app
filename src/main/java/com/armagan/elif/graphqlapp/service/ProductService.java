package com.armagan.elif.graphqlapp.service;

import com.armagan.elif.graphqlapp.model.Product;
import com.armagan.elif.graphqlapp.repository.ProductRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    public List<Product> getProductsByCategoryId(Long categoryId){
        return productRepository.getProductByCategoryId(categoryId);
    }

    public List<Product> getProductsByCampaignId(Long campaignId){
        return productRepository.getProductByCampaignId(campaignId);
    }
}
