package com.lyf.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

    @GetMapping(value = "hello")
    public String hello(@RequestParam(name = "msg", defaultValue = "null") String msg) {
        return "hello world ! " + msg;
    }

    @GetMapping(value = "/actuator/info")
    public String info() {
        return "hello !!!!!!!!!! info";
    }
}
