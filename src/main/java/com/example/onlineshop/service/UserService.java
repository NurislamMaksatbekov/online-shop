package com.example.onlineshop.service;

import com.example.onlineshop.dto.UserDto;
import com.example.onlineshop.entity.AppUser;
import com.example.onlineshop.exception.RoleNotFoundException;
import com.example.onlineshop.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;


@Service
@RequiredArgsConstructor
public class UserService {
    private final PasswordEncoder encoder;
    private final CartService cartService;
    private final RoleService roleService;
    private final UserRepository userRepository;

    public void registerNewUser(UserDto userDto) throws RoleNotFoundException {
        if (userDto.getRole().equals("ADMIN")) throw new IllegalArgumentException("Can not be admin!");

        var role = roleService.findByRole(userDto.getRole().toUpperCase());

        var user = AppUser.builder()
                .email(userDto.getEmail())
                .name(userDto.getName())
                .password(encoder.encode(userDto.getPassword()))
                .roles(Collections.singleton(role))
                .build();
        if (checkEmail(user.getEmail())) throw new IllegalArgumentException("User with this email already exists.");
        userRepository.save(user);
        cartService.createCart(user);
    }

    public String getUserById(String email){
        return userRepository.getReferenceById(email).getEmail();
    }

    public boolean checkEmail(String email) {
        return userRepository.findAll()
                .stream()
                .anyMatch(user -> user.getEmail().equals(email));
    }
}
