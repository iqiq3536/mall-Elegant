package com.example.mallxx.controller;

import com.example.mallxx.entity.Seller;
import com.example.mallxx.mapper.SellerMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class UserController {

    @GetMapping("/hello")
    public String hello() {
        return "HELLO";
    }
}