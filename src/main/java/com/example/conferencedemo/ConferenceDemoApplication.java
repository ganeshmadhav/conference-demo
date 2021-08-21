package com.example.conferencedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConferenceDemoApplication {

	public static void main(String[] args) {
		var hello = 2;
		SpringApplication.run(ConferenceDemoApplication.class, args);
	}

}
