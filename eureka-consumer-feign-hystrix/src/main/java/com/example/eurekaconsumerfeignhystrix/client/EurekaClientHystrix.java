package com.example.eurekaconsumerfeignhystrix.client;

import org.springframework.stereotype.Component;

@Component
public class EurekaClientHystrix implements EurekaClient {

    @Override
    public String hello() {
        return "hello hystrix!";
    }
}
