package com.franchiseEnquiry.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FranchiseEnquiryFormDTO {

    private Long id;

    @NotBlank(message = "First name is required")
    private String firstName;

    @NotBlank(message = "Last name is required")
    private String lastName;

    @Email(message = "Invalid email address")
    @NotBlank(message = "Email is required")
    private String email;

    @Pattern(regexp = "[0-9]{10}", message = "Mobile number must be a 10-digit number")
    @NotBlank(message = "Mobile number is required")
    private String mobile;

    @NotBlank(message = "Pincode is required")
    private String pincode;

    @NotBlank(message = "State is required")
    private String state;

    @NotBlank(message = "City is required")
    private String city;

    // Constructors, getters, and setters
    // ...
}
