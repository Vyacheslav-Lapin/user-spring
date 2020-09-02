package ru.otus.user.userspring

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding
import org.springframework.stereotype.Component

@Component
//@ConstructorBinding
//@ConfigurationProperties("my-properties")
class Person(var name: String = "Вася", var age: Int = 17) {

}
