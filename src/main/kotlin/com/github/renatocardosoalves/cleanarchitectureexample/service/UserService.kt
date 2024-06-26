package com.github.renatocardosoalves.cleanarchitectureexample.service

import com.github.renatocardosoalves.cleanarchitectureexample.model.User
import com.github.renatocardosoalves.cleanarchitectureexample.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(
    val userRepository: UserRepository
) {
    fun create(user: User): User {
        return this.userRepository.save(user)
    }
}