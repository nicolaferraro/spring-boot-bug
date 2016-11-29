package org.example.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 */
@Configuration
// Unconstrained
public class A3 {

    @Bean
    public BeanA3 beanA3() {
        return new BeanA3();
    }

}
