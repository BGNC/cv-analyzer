package com.bgnc.cv_analyzer.dto.request;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class AuthRequest {

    @NotNull
    @Email(message = "Email is required for authentication and fill in the blanks.")
    @Column(unique = true)
    private String email;

    @NotNull(message = "Please fill in the password field.")
    private String password;

}
