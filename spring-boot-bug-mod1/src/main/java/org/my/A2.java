package org.my;

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
public class A2 {

    @Bean
    public BeanA2 beanA2() {
        return new BeanA2();
    }

}
