package com.example.onlineshop.controller;

import com.example.onlineshop.dto.UserDto;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public interface AuthController {

    @GetMapping("/login")
    String login();

    @GetMapping("/register")
    String register();

    @PostMapping("/register")
    ResponseEntity<?> register(@Valid UserDto userDto);
}
