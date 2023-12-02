package com.example.onlineshop.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductDto {
    Long id;
    String title;
    int quantity;
    String description;
    double price;
    String category;
    String user;

}
