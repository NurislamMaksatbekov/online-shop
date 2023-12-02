package com.example.onlineshop.dto;

import jakarta.validation.constraints.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserDto {

    @NotEmpty
    @NotBlank
    @Email
    String email;

    @NotEmpty
    @NotBlank
    String name;

    @NotEmpty
    @NotBlank
    @Size(min = 4, max = 24,
            message = "Length of password must be >= 4 and <= 24")
    @Pattern(regexp = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).+$",
            message = "Password should contain at least one uppercase letter, one number")
    String password;

    @NotEmpty
    @NotBlank
    String role;
}
