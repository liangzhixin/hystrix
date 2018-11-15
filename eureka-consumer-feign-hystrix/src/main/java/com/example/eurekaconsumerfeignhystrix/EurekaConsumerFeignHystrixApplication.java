package com.example.eurekaconsumerfeignhystrix;

import com.example.eurekaconsumerfeignhystrix.client.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableCircuitBreaker
@RestController
public class EurekaConsumerFeignHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerFeignHystrixApplication.class, args);
    }

    @Autowired
    private EurekaClient eurekaClient;

    @GetMapping("/hello")
    public void hello(){
        String res = eurekaClient.hello();
        System.out.println(res);
    }

}
