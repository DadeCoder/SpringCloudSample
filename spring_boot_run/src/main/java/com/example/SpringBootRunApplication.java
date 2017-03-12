package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;

@SpringBootApplication
@RestController
public class SpringBootRunApplication {

	@RequestMapping("login")
	String login(){
		return "Logining in!";
	}

	ArrayList list = new ArrayList();

	HashMap hashMap = new HashMap<>();

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRunApplication.class, args);
	}
}
