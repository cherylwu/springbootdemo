package com.example.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootdemoApplication {

    public static void main(String[] args) {
        HelloController helloController = new HelloController();
        System.out.println(helloController.maxOf(15, 16));
        SpringApplication.run(SpringbootdemoApplication.class, args);

    }
}
