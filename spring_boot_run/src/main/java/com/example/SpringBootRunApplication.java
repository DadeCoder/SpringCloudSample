package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootRunApplication {

	@RequestMapping("login")
	String login(){
		return "Logining in!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRunApplication.class, args);
	}
}
