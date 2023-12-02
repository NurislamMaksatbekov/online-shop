package com.example.onlineshop.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/categories")
public interface CategoryController {
    @GetMapping
    ResponseEntity<?> getAllCategories();

    @GetMapping("/id")
    ResponseEntity<?> getCategoryById(@RequestParam Long id);
}
