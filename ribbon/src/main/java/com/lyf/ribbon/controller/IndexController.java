package com.lyf.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class IndexController {

    private final RestTemplate restTemplate;

    @Autowired
    public IndexController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("index")
    public String index() {
        return restTemplate.getForObject("http://DEMO-CLIENT1/actuator/info", String.class);
    }
}
