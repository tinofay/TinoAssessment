package com.tino.loginAssessment.dto;


import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto
{
    private Long id;
    @NotEmpty(message = "Name should not be empty")
    private String fullName;
    @NotEmpty
    private String gender;
    @NotEmpty
    private String dateOfBirth;
    @NotEmpty(message = "Password should not be empty")
    private String password;
}
