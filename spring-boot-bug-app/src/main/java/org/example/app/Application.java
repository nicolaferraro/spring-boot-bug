package org.example.app;

import org.my.BeanA1;
import org.my.BeanA2;
import org.my.BeanB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 */
@SpringBootApplication
public class Application {

    @Autowired
    private BeanB b;

    @Autowired
    private BeanA1 a1;

    @Autowired
    private BeanA2 a2;

    @Autowired
    private BeanA3 a3;

    @Autowired
    private BeanA4 a4;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
