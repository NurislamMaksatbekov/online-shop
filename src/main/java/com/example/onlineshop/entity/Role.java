package com.example.onlineshop.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;

@Getter
@Setter
@Entity
@Table(name = "roles")
@Builder
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Role extends BaseEntity {

    private String role;

    @ManyToMany(mappedBy = "roles")
    private Collection<AppUser> users;
}
