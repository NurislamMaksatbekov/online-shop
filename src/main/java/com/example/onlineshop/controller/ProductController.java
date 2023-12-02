package com.example.onlineshop.controller;

import com.example.onlineshop.exception.CategoryNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public interface ProductController {
    @GetMapping
    ResponseEntity<?> getAllProducts() throws ClassNotFoundException, CategoryNotFoundException;

}
