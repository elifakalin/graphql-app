package com.armagan.elif.graphqlapp.resolver.query;

import com.armagan.elif.graphqlapp.model.Campaign;
import com.armagan.elif.graphqlapp.repository.CampaignRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class CampaignQuery implements GraphQLQueryResolver {

    private final CampaignRepository campaignRepository;

    public CampaignQuery(CampaignRepository campaignRepository) {
        this.campaignRepository = campaignRepository;
    }

    public List<Campaign> getCampaigns(){
        return campaignRepository.findAll();
    }
}
