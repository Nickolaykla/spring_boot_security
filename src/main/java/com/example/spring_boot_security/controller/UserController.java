package com.example.spring_boot_security.controller;

import com.example.spring_boot_security.model.User;
import com.example.spring_boot_security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public String getUserPage(Model model) {
        List<User> users = userRepository.findAll();
        model.addAttribute("users", users);
        return "users_page";
    }
}
