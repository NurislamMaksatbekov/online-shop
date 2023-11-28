package com.example.onlineshop.repository;

import com.example.onlineshop.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AppUser, String > {
}
