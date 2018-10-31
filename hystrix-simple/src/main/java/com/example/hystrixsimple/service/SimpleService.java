package com.example.hystrixsimple.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class SimpleService {

    @HystrixCommand(fallbackMethod = "defaultStores")
    public void getStore() throws InterruptedException {
        log.info(">>>>>调用getStore<<<<<");
    }

    public void defaultStores(){
        log.info(">>>>>调用defaultStores<<<<<");
    }
}
