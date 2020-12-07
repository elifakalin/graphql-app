package com.armagan.elif.graphqlapp.repository;

import com.armagan.elif.graphqlapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> getProductByCategoryId(Long categoryId);
    List<Product> getProductByCampaignId(Long campaignId);

}
