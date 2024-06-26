package com.github.renatocardosoalves.cleanarchitectureexample.infrastructure.database.entity

import com.github.renatocardosoalves.cleanarchitectureexample.domain.entity.User
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.*

@Entity
@Table(name = "users")
class UserEntity(
    @Id
    val id: UUID,
    val username: String,
    val password: String,
    val email: String
) {
    companion object {
        fun from(user: User): UserEntity {
            return UserEntity(user.id, user.username, user.password, user.email)
        }
    }

    fun toDomain(): User {
        return User.create(this.username, this.email, this.password, this.id)
    }
}