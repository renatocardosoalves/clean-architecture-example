package com.github.renatocardosoalves.cleanarchitectureexample.infrastructure.web.request

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank

data class CreateUserRequest(
    @field:NotBlank
    val username: String,
    @field:NotBlank
    val password: String,
    @field:NotBlank
    @field:Email
    val email: String
)
