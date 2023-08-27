package com.example.project_2.configs;

import com.stripe.Stripe;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Value("${stripe.api.secretKey}")
    private String stripeSecretKey;

    @PostConstruct
    private void stripeKeySet() {
        Stripe.apiKey = stripeSecretKey;
        System.out.println(stripeSecretKey + "888");
    }
}
