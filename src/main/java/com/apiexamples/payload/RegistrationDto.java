package com.apiexamples.payload;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class RegistrationDto {

    private Long id;

    @Size(min = 2, max = 20, message = "Should be more than 2 characters")
    private String name;

    @Email(message = "Invalid email address")
    private String email;

    @Size(min = 10, max = 10, message = "Should be 10 digits")
    private String mobile;

    private String message;

    private int pageNo;
}