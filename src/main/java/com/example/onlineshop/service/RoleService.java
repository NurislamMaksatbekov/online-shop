package com.example.onlineshop.service;

import com.example.onlineshop.entity.Role;
import com.example.onlineshop.exception.RoleNotFoundException;
import com.example.onlineshop.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleService {
    private final RoleRepository repository;

    public Role findByRole(String role) throws RoleNotFoundException {
        return repository.findByRole(role).orElseThrow(() -> new RoleNotFoundException("Role not found!"));
    }

}
