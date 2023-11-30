package com.example.onlineshop.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Entity
@Builder
@Table(name = "categories")
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Category extends BaseEntity{


    String category;

    @ManyToOne
    Product product;

}
