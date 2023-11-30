package com.example.onlineshop.repository;

import com.example.onlineshop.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<AppUser, String > {
    List<AppUser> findAll();

    Optional<AppUser> getByEmail(String email);

}
