package com.example.spring_boot_security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignInController {
    @GetMapping("/signIn")
    public String getSignInPage() {
        return "signIn_page";
    }
}
