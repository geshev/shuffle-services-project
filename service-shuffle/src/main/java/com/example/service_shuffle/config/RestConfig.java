package com.example.service_shuffle.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriBuilderFactory;

@Configuration
@EnableAsync
public class RestConfig {

    @Value("${log.service.url}")
    private String logUrl;

    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();

        DefaultUriBuilderFactory uriBuilderFactory = new DefaultUriBuilderFactory(logUrl);
        restTemplate.setUriTemplateHandler(uriBuilderFactory);

        return restTemplate;
    }
}
