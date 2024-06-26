package com.github.renatocardosoalves.cleanarchitectureexample.infrastructure.web.controller

import com.github.renatocardosoalves.cleanarchitectureexample.application.command.CreateUserCommand
import com.github.renatocardosoalves.cleanarchitectureexample.application.usecase.CreateUser
import com.github.renatocardosoalves.cleanarchitectureexample.infrastructure.web.request.CreateUserRequest
import com.github.renatocardosoalves.cleanarchitectureexample.infrastructure.web.response.UserCreatedResponse
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(path = ["/users"])
class UserController(
    val createUser: CreateUser
) {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody @Valid request: CreateUserRequest): UserCreatedResponse {
        val userCreated = this.createUser.execute(CreateUserCommand(request.username, request.password, request.email))
        return UserCreatedResponse.from(userCreated)
    }
}