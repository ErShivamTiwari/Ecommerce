package com.spring.ecommerce.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.beans.BeanProperty;
@Configuration
public class AppicationConfiguration {
    @Bean
    public RestTemplate createRestTmplete(){
        return new RestTemplate();
    }

}
