package com.example.validation;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class ValidationApplication {

	public static void main(String[] args) {
		var app = new SpringApplication(ValidationApplication.class);
		app.run(args);
	}
}
