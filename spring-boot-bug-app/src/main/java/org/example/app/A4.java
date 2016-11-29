package org.example.app;

import org.my.B;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 */
@Configuration
@ConditionalOnBean(B.class)
@AutoConfigureAfter(B.class)
public class A4 {

    @Bean
    public BeanA4 beanA4() {
        return new BeanA4();
    }

}
