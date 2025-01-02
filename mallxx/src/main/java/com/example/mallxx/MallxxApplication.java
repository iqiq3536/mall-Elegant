package com.example.mallxx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.mallxx.mapper", "com.example.mallxx.controller"})
public class MallxxApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallxxApplication.class, args);
    }
}
