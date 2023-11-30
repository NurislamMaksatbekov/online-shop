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

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(name = "role_id"),
            inverseJoinColumns = @JoinColumn(name = "user_email")
    )
    private Collection<AppUser> users;

}
