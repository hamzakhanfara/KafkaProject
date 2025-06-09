package com.example.kafkaproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.kafkaproject.repository")
@EntityScan(basePackages = "com.example.kafkaproject.model")
public class KafkaprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaprojectApplication.class, args);
    }

} // <-- Make sure this closing bracket is here!

