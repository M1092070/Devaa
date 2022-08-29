package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class DemoForSushmaApplication {
	@GetMapping("/fruits")
	public String fruits() {
		return "sushi looks like mango fruit";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoForSushmaApplication.class, args);
	}

}
