package com.letsgo.LetsGo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LetsGoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LetsGoApplication.class, args);
	}

}
