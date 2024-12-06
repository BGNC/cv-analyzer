package com.bgnc.cv_analyzer.model;

import com.bgnc.cv_analyzer.enums.Role;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Candidate extends BaseEntity implements UserDetails {


    @NotNull
    @Email
    @Column(unique = true) // Email should unique
    private String email;

    @NotNull
    private String name;

    @NotNull
    private String surname;

    @NotNull
    private String password; // password should have been hash

    @Enumerated(EnumType.STRING)
    @NotNull
    @Builder.Default
    private Role role = Role.USER; // assume that default role is user

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // Kullanıcı rolünü GrantedAuthority olarak döner
        return Collections.singleton(() -> "ROLE_" + role.name());
    }

    @Override
    public String getUsername() {
        return email; // return an email as a username
    }

    @Override
    public boolean isAccountNonExpired() {
        return true; //
    }

}
