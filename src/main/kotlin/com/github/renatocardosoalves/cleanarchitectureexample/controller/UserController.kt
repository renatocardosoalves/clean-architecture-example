package com.github.renatocardosoalves.cleanarchitectureexample.controller

import com.github.renatocardosoalves.cleanarchitectureexample.model.User
import com.github.renatocardosoalves.cleanarchitectureexample.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(path = ["/users"])
class UserController(
    val userService: UserService
) {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody user: User): User {
        return this.userService.create(user)
    }
}