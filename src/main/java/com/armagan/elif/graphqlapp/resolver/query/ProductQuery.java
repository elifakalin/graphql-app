package com.armagan.elif.graphqlapp.resolver.query;

import com.armagan.elif.graphqlapp.model.Product;
import com.armagan.elif.graphqlapp.service.ProductService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class ProductQuery implements GraphQLQueryResolver {

    private final ProductService productService;

    public ProductQuery(ProductService productService) {
        this.productService = productService;
    }

    public List<Product> getProducts() {
        return productService.getProducts();
    }

    public List<Product> getProductsByCategoryId(Long categoryId) {
        return productService.getProductsByCategoryId(categoryId);
    }

    public List<Product> getProductsByCampaignId(Long campaignId) {
        return productService.getProductsByCampaignId(campaignId);
    }
}
