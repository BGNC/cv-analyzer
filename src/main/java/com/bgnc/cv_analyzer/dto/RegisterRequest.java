package com.bgnc.cv_analyzer.dto;

import com.bgnc.cv_analyzer.enums.Role;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class RegisterRequest {

    @NotNull
    @Email
    @Column(unique = true)
    private String email;

    @NotNull(message = "Name field is required.")
    private String name;

    @NotNull(message = "Surname field is required.")
    private String surname;

    @NotNull(message = "Please fill in the password field.")
    private String password;

    private Role role = Role.USER;
}
