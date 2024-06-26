package com.github.renatocardosoalves.cleanarchitectureexample.application.command

import com.github.renatocardosoalves.cleanarchitectureexample.domain.entity.User

data class CreateUserCommand(
    val username: String,
    val password: String,
    val email: String
) {
    fun toDomain(): User {
        return User.create(this.username, this.password, this.email)
    }
}