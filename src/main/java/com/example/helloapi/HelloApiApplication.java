package com.example.helloapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloApiApplication.class, args);
		System.out.println("success");
	}

}
