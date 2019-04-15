package com.lyf.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "demo-client1")
public interface IFeignDemo {

    /**
     * 调用demo-client1服务的 hello接口
     */
    @RequestMapping(value = "hello", method = RequestMethod.GET)
    String getHello(@RequestParam(value = "msg") String msg);
}
