package com.example.onlineshop.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "products")
public class Product extends BaseEntity {

    String title;

    @OneToOne(mappedBy = "product")
    ProductImage productImage;

    int quantity;

    String description;

    double price;

    @OneToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    Category category;

    @ManyToMany(mappedBy = "products")
    List<Cart> carts;

    @ManyToOne
    @JoinColumn(name = "seller_id", referencedColumnName = "email")
    AppUser user;
}
