package com.github.renatocardosoalves.cleanarchitectureexample.domain.repository

import com.github.renatocardosoalves.cleanarchitectureexample.domain.entity.User

interface UserRepository {
    fun save(user: User): User
}