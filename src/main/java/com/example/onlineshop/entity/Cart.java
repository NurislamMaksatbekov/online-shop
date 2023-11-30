package com.example.onlineshop.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@Setter
@Builder
@Entity
@Table(name = "carts")
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Cart extends BaseEntity{

    @OneToOne
    AppUser user;

    @ManyToMany
    List<Product> products;
}
