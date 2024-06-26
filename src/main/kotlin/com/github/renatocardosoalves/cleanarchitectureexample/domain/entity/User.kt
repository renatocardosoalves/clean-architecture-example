package com.github.renatocardosoalves.cleanarchitectureexample.domain.entity

import java.util.UUID

class User private constructor(
    val id: UUID,
    val username: String,
    val email: String,
    val password: String
) {
    companion object {
        fun create(username: String, email: String, password: String, userId: UUID = UUID.randomUUID()): User {
            return User(userId, username, email, password)
        }
    }
}