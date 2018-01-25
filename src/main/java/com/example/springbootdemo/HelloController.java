package com.example.springbootdemo;

import kotlindemo.HelloWorldKt;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello, this is a springboot demo!";
    }

    public int maxOf(int x, int y) {
        return HelloWorldKt.maxOf(x, y);
    }
}
