package com.example.eurekaconsumerfeignhystrix.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "eureka-client", fallback = EurekaClientHystrix.class)
public interface EurekaClient {

    @GetMapping("/hello")
    String hello();
}
