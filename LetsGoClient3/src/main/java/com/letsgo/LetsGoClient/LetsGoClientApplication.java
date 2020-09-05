package com.letsgo.LetsGoClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class LetsGoClientApplication {
	@RequestMapping("/")
	public String greeting()
	{
		return "Welcome Thangaraj";
	}

	public static void main(String[] args) {
		SpringApplication.run(LetsGoClientApplication.class, args);
	}

}
