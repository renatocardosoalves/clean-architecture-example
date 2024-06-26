package com.github.renatocardosoalves.cleanarchitectureexample.infrastructure.configuration

import com.github.renatocardosoalves.cleanarchitectureexample.application.usecase.CreateUser
import com.github.renatocardosoalves.cleanarchitectureexample.domain.repository.UserRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class BeanConfiguration {
    @Bean
    fun createUser(userRepository: UserRepository): CreateUser {
        return CreateUser(userRepository)
    }
}