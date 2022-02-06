package com.basket.model.config;

import com.basket.model.Cart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

@Configuration
public class CartConfiguration {
    @Bean
    @SessionScope
    public Cart cart() {
        return new Cart();
    }
}
