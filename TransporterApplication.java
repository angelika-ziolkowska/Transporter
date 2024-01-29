package com.example.transporter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @EnableAutoConfiguration
// @ComponentScan({"controller", "service"})
// @EntityScan("entity")
// @EnableJpaRepositories("repository")
// @EnableJpaRepositories(basePackages = {"com.example.books.backend.model", "com.example.books.backend.repository"})

// @ComponentScan({"com.delivery.request"})
// @EntityScan("com.example.books.backend.model")
// @EnableJpaRepositories("com.example.books.backend.repository")

@EnableAutoConfiguration
@SpringBootApplication
public class TransporterApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransporterApplication.class, args);
	}
}
