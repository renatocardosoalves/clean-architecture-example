package com.github.renatocardosoalves.cleanarchitectureexample.application.usecase

import com.github.renatocardosoalves.cleanarchitectureexample.application.command.CreateUserCommand
import com.github.renatocardosoalves.cleanarchitectureexample.domain.entity.User
import com.github.renatocardosoalves.cleanarchitectureexample.domain.repository.UserRepository

class CreateUser(
    private val userRepository: UserRepository
) {
    fun execute(command: CreateUserCommand): User {
        return this.userRepository.save(command.toDomain())
    }
}