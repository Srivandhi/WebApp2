package com.sri;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

	    @Bean
	    public GroupedOpenApi studentApi() {
	        return GroupedOpenApi.builder()
	                .group("student-api")
	                .pathsToMatch("/api/**")  
	                .build();
	    }
}
