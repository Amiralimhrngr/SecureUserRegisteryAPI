package ir.maktabsharif.dto;

import jakarta.validation.constraints.*;

public record SignupRequest(
        @NotBlank @Size(min = 5, max = 20) @Pattern(regexp = "^[a-zA-Z0-9_]+$") String username,
        @NotBlank @Size(min = 8, max = 72) @Pattern(regexp = "[\\x20-\\x7E]+", message = "Password must contain printable ASCII characters") String password,
        @NotBlank @Size(min = 0, max = 100) String fullName,
        short age
) {
}
