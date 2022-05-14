package com.suy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.suy")
public class Hibernate051118Application {

    public static void main(String[] args) {
        SpringApplication.run(Hibernate051118Application.class, args);
    }

}
