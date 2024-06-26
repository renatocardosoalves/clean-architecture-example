package com.github.renatocardosoalves.cleanarchitectureexample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CleanArchitectureExampleApplication

fun main(args: Array<String>) {
    runApplication<CleanArchitectureExampleApplication>(*args)
}