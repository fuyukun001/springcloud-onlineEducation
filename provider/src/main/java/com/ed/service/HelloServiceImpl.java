package com.ed.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloServiceImpl implements HelloService {

    @RequestMapping("/")
    public String hello(){

        return "启动成功";
    }
}
