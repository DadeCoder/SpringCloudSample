package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
//@RestController
@Controller
public class SpringSecLoginApplication {

//	@RequestMapping("/login")
//	ModelAndView login(){
//		return new ModelAndView("/login.html");
//	}

	@RequestMapping("/login")
	String login(){
		return "/login";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringSecLoginApplication.class, args);
	}
}
