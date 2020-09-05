package com.letsgo.LetsGoClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "eureka-client-3", url = "http://localhost:8003/")
public interface MyFeignInterface {
	@GetMapping
	String client3Response();

}
