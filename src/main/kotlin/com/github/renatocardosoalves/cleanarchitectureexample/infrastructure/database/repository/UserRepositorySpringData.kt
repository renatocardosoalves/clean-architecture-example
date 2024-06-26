package com.github.renatocardosoalves.cleanarchitectureexample.infrastructure.database.repository

import com.github.renatocardosoalves.cleanarchitectureexample.infrastructure.database.entity.UserEntity
import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface UserRepositorySpringData : CrudRepository<UserEntity, UUID>