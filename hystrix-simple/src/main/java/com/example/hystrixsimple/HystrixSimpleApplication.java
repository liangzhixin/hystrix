package com.example.hystrixsimple;

import com.example.hystrixsimple.service.SimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;


@SpringBootApplication
@EnableCircuitBreaker
@EnableEurekaClient
@RestController
public class HystrixSimpleApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixSimpleApplication.class, args);
    }

    @Autowired
    private SimpleService simpleService;

    @GetMapping("/get")
    public void getStores() throws InterruptedException {
        simpleService.getStore();
    }
}


