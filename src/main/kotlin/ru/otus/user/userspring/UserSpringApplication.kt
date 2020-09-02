package ru.otus.user.userspring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
//@ConfigurationPropertiesScan("ru.otus.user.userspring")
//@EnableConfigurationProperties(Person::class)
class UserSpringApplication

fun main(args: Array<String>) {
    runApplication<UserSpringApplication>(*args)
}

