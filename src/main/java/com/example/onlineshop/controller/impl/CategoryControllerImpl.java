package com.example.onlineshop.controller.impl;

import com.example.onlineshop.controller.CategoryController;
import com.example.onlineshop.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CategoryControllerImpl implements CategoryController {
    private final CategoryService categoryService;
    @Override
    public ResponseEntity<?> getAllCategories() {
        return ResponseEntity.ok(categoryService.getAll());
    }

    @Override
    public ResponseEntity<?> getCategoryById(Long id) {
        return ResponseEntity.ok(categoryService.getCategoryById(id));
    }
}
