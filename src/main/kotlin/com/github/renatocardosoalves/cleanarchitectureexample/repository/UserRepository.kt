package com.github.renatocardosoalves.cleanarchitectureexample.repository

import com.github.renatocardosoalves.cleanarchitectureexample.model.User
import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface UserRepository : CrudRepository<User, UUID>