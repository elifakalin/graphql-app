package com.armagan.elif.graphqlapp;

import com.armagan.elif.graphqlapp.resolver.Mutation;
import com.armagan.elif.graphqlapp.resolver.Query;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GraphqlAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlAppApplication.class, args);
	}

	@Bean
	public Query query() {
		return new Query();
	}

	@Bean
	public Mutation mutation() {
		return new Mutation();
	}
}
