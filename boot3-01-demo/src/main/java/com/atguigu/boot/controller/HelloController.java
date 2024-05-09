package com.atguigu.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author：qinshixin
 * @Date：2024/5/9 上午10:47
 */
@RestController
public class HelloController
{
    @GetMapping("/hello")
    public String hello(){

        return "Hello,Spring Boot 3!";
    }
}
