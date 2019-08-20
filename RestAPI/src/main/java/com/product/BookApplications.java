package com.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class BookApplications {

    public static void main(String[] args)
    {
        SpringApplication.run(BookApplications.class, args);
    }
}

