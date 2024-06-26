package com.github.renatocardosoalves.cleanarchitectureexample.infrastructure.web.response

import com.github.renatocardosoalves.cleanarchitectureexample.domain.entity.User
import java.util.UUID

class UserCreatedResponse private constructor(
    val id: UUID,
    val username: String,
    val email: String
) {
    companion object {
        fun from(user: User): UserCreatedResponse {
            return UserCreatedResponse(user.id, user.username, user.email)
        }
    }
}