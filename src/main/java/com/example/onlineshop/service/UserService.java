package com.example.onlineshop.service;

import com.example.onlineshop.dto.UserDto;
import com.example.onlineshop.entity.AppUser;
import com.example.onlineshop.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder encoder;

    public void registerNewUser(UserDto userDto) {
        var user = AppUser.builder()
                .email(userDto.getEmail())
                .name(userDto.getName())
                .password(encoder.encode(userDto.getPassword()))
                .build();
        if (!checkEmail(user.getEmail())) {
            userRepository.save(user);
        } else throw new IllegalArgumentException("User with this email already exists.");
    }

    public boolean checkEmail(String email) {
        return userRepository.findAll()
                .stream()
                .anyMatch(user -> user.getEmail().equals(email));
    }
}
