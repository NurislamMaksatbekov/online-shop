package com.example.onlineshop.controller.impl;

import com.example.onlineshop.controller.ProductController;
import com.example.onlineshop.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProductControllerImpl implements ProductController {
    private final ProductService productService;
    @Override
    public ResponseEntity<?> getAllProducts() {
        return ResponseEntity.ok(productService.getAllProducts());
    }
}
