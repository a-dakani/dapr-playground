package com.example.daprjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DaprJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaprJavaApplication.class, args);
		System.out.println("Hello, Dapr!");
	}

}
