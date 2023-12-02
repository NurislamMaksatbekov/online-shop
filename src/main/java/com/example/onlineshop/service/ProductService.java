package com.example.onlineshop.service;

import com.example.onlineshop.dto.ProductDto;
import com.example.onlineshop.entity.Product;
import com.example.onlineshop.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final UserService userService;
    private final CategoryService categoryService;
    private final ProductRepository productRepository;

    public List<ProductDto> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return products.stream().map(e -> ProductDto.builder()
                        .id(e.getId())
                        .title(e.getTitle())
                        .quantity(e.getQuantity())
                        .description(e.getDescription())
                        .price(e.getPrice())
                        .category(categoryService.getCategoryById(e.getCategory().getId()))
                        .user(userService.getUserById(e.getUser().getEmail()))
                        .build())
                .collect(Collectors.toList());

    }
}
