package com.jc.consumer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author jincheng
 * @Date 2022/9/29 17:25
 * @Version 1.0
 **/
@RestController
public class TestController {
    @Value("${server.port}")
    int port;

    @RequestMapping("/demo")
    public int test(){
        return port;
    }
}
