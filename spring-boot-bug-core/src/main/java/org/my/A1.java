package org.my;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 */
@Configuration
@AutoConfigureAfter(B.class)
@ConditionalOnBean(B.class)
public class A1 {

    @Bean
    public BeanA1 beanA1() {
        return new BeanA1();
    }

}
