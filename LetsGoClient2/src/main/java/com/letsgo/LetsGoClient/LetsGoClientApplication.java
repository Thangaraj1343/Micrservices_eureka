package com.letsgo.LetsGoClient;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@RestController
@EnableFeignClients
public class LetsGoClientApplication {
	/*
	 * @Bean public RestTemplate getRestTemplate() { return new RestTemplate(); }
	 * 
	 * @Autowired private RestTemplate restTemplate;
	 */
	
	@Autowired
	private MyFeignInterface myFeignInterface;
	 
	@RequestMapping("/")
	public String greeting() throws JSONException
	{
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("message", "Hello world 2");
		jsonObject.put("message-3 ", new JSONObject(myFeignInterface.client3Response()));
		
		return jsonObject.toString();
	}

	public static void main(String[] args) {
		SpringApplication.run(LetsGoClientApplication.class, args);
	}

}
