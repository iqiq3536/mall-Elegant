package com.example.mallxx.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;
@CrossOrigin
@RequestMapping("/api")
public class LoginController {

    @CrossOrigin
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Map<String, String> loginData) {
        String username = loginData.get("username");
        String password = loginData.get("password");
        System.out.println("SF90xx");
        if ("admin".equals(username) && "123456".equals(password)) {
            return ResponseEntity.ok("登录成功！");iiiiiiiii
        } else {
            return ResponseEntity.badRequest().body("登录失败：用户名或密码错误");
        }
    }
}
