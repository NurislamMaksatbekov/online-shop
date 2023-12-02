package com.example.onlineshop.service;

import com.example.onlineshop.dto.CategoryDto;
import com.example.onlineshop.entity.Category;
import com.example.onlineshop.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public String getCategoryById(Long id) {
        return categoryRepository.getReferenceById(id).getCategory();
    }

    public List<CategoryDto> getAll() {
        List<Category> categories = categoryRepository.findAll();
        return categories.stream().map(e -> CategoryDto.builder()
                .category(e.getCategory())
                .build()).collect(Collectors.toList());
    }
}
