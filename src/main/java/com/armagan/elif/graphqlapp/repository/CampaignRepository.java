package com.armagan.elif.graphqlapp.repository;

import com.armagan.elif.graphqlapp.model.Campaign;
import com.armagan.elif.graphqlapp.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampaignRepository extends JpaRepository<Campaign, Long> {
}
