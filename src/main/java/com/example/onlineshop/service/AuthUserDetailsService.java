package com.example.onlineshop.service;

import com.example.onlineshop.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthUserDetailsService implements UserDetailsService {

    private final UserRepository repository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return repository.getByEmail(username).orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }
}
