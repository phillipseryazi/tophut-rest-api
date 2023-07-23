package com.mudhut.tophut.users;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.Email;

@Entity(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        @NotEmpty
        @Email
        private String email;
        @NotEmpty
        private String password;
        private Boolean isActive;
        private LocalDateTime createdAt;
        private LocalDateTime updatedtAt;
}
