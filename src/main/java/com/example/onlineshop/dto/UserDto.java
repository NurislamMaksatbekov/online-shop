package com.example.onlineshop.dto;

import jakarta.validation.constraints.Email;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserDto {
    String email;
    String name;
    String password;
}
