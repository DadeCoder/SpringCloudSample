package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.route.ZuulFallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringCloudApplication
@EnableZuulProxy
//@RestController
public class ServicegatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicegatewayApplication.class, args);
	}

	@Bean
	public AccessFilter accessFilter() {
		return new AccessFilter();
	}

//	@RequestMapping("/timeout")
//	public String timeout() throws InterruptedException {
//		Thread.sleep(80000);
//		return "timeout";
//	}

	@Bean
	public ZuulFallbackProvider route1ZuulFallbackProvider() {
		GenericZuulFallbackProvider route1ZuulFallback = new GenericZuulFallbackProvider();
		route1ZuulFallback.setRoute("COMPUTE-SERVICE");
		return route1ZuulFallback;
	}

}
