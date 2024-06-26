package com.github.renatocardosoalves.cleanarchitectureexample.model

import jakarta.persistence.*
import java.util.UUID

@Entity
@Table(name = "users")
class User(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: UUID? = null,
    val username: String,
    val password: String,
    val email: String
)