package com.example.validation;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ValidationApplication {

    public static void main(String[] args) {
        var app = new SpringApplication(ValidationApplication.class);
        app.run(args);
    }
}
