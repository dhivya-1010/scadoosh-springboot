package com.phase6.task_management.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class LoginRequest {
    @NotBlank(message = "Email cannot be empty")
    @Email(message = "Enter valid email")
    private String email;

    @NotBlank(message = "Password required")
    @Size(min = 8, message = "Password must contain at lease 8 chars")
    private String password;
}