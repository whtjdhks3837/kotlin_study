package Solid

/**
 * 단일 책임 원칙.
 * 모든 클래스는 하나의 책임만 가져야하며
 * 그 책임은 캡슐화 되어야함.
 */
fun singleResponsibilityPrinciple() {
    val joe = Developer()
    joe.age = 27
    joe.name = "Joe"
    joe.gender = Gender.male
    joe.skill.add("java")
    joe.skill.add("kotlin")
    joe.company = "konkuk univ"

    println("${joe.age} " +
            "${joe.name} " +
            "${joe.gender} " +
            "${joe.company}")
    joe.skill.forEach { print("$it ") }
}

object Gender {
    val male = 0
    val female = 1
}

open class Person {
    var age: Int = 0
    var name: String = ""
    var gender: Int = Gender.male
}

class Developer : Person() {
    var skill = ArrayList<String>()
    var company: String? = null
}