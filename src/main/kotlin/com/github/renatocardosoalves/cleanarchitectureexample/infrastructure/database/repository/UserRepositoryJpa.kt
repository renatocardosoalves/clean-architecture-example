package com.github.renatocardosoalves.cleanarchitectureexample.infrastructure.database.repository

import com.github.renatocardosoalves.cleanarchitectureexample.domain.entity.User
import com.github.renatocardosoalves.cleanarchitectureexample.domain.repository.UserRepository
import com.github.renatocardosoalves.cleanarchitectureexample.infrastructure.database.entity.UserEntity
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Repository
class UserRepositoryJpa(
    val userRepositorySpringData: UserRepositorySpringData
) : UserRepository {
    @Transactional
    override fun save(user: User): User {
        val userCreated = this.userRepositorySpringData.save(UserEntity.from(user))
        return userCreated.toDomain()
    }
}