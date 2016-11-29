package org.my;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 */
@Configuration
public class B {

    @Bean
    public BeanB beanB() {
        return new BeanB();
    }

}
