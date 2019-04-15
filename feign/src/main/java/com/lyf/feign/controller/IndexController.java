package com.lyf.feign.controller;

import com.lyf.feign.service.IFeignDemo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class IndexController {

    /**
     * 由于IFeignDemo是在程序启动时注入的，使用 @Autowired 会报错
     */
    @Resource(type = IFeignDemo.class)
    private IFeignDemo iFeignDemo;

    @GetMapping(value = "index")
    public String index(@RequestParam(value = "msg", defaultValue = "hello world") String msg) {
        return iFeignDemo.getHello(msg);
    }
}
