package com.example.spring_boot_security.controller;

import com.example.spring_boot_security.model.User;
import com.example.spring_boot_security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignUpController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/signUp")
    public String getSignUpPage() {
        return "signUp_page";
    }

    @PostMapping("/signUp")
    public String signUpUser(User user) {
        user.setHashPassword(passwordEncoder.encode(user.getPassword()));
       userRepository.save(user);
       return "redirect:/signUp";
    }
}
