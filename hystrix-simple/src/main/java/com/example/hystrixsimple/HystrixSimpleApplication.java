package com.example.hystrixsimple;

import com.example.hystrixsimple.service.SimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;


@SpringBootApplication
@EnableCircuitBreaker
@EnableScheduling
public class HystrixSimpleApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixSimpleApplication.class, args);
    }

    @Autowired
    private SimpleService simpleService;

    @Scheduled(cron = "0/2 * * * * ?")
    public void getStores() throws InterruptedException {
        simpleService.getStore();
    }
}


