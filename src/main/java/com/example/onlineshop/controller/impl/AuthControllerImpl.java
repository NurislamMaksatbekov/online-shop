package com.example.onlineshop.controller.impl;

import com.example.onlineshop.controller.AuthController;
import com.example.onlineshop.dto.UserDto;
import com.example.onlineshop.exception.RoleNotFoundException;
import com.example.onlineshop.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AuthControllerImpl implements AuthController {
    private final UserService userService;

    @Override
    public String login() {
        return "/auth/login";
    }

    @Override
    public String register() {
        return "/auth/register";
    }

    @Override
    public String register(UserDto userDto) throws RoleNotFoundException {
        userService.registerNewUser(userDto);
        return "redirect:/";
    }
}
