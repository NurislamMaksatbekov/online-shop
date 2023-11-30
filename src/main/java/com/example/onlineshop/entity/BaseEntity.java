package com.example.onlineshop.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.*;

@MappedSuperclass
@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
}
