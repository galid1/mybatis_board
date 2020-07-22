package com.galid.mybatisboard.controller;

import com.galid.mybatisboard.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/auth/signIn")
    public String getLoginPage() {
        return "authentication/signIn";
    }

    @GetMapping("/auth/signUp")
    public String getSignUpPage() {
        return "authentication/signUp";
    }

    @PostMapping("/auth/doSignUp")
    public void doSignUp() {

    }
}
