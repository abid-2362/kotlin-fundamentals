package com.rsk

data class Person(val name: String, val age: Int) {

}

fun main() {
    val sam = Person("Sam", 31)

    // this will copy the reference
    // val samuel = sam.copy()

    // this will copy the data
    val samuel = sam.copy(age = 32)

    println("$sam has hashcode ${sam.hashCode()}")
    println("$samuel has hashcode ${samuel.hashCode()}")

    if(sam.equals(samuel)) {
        println("Sam and Samuel are equal")
    } else {
        println("Sam and Samuel are not equal")
    }

    // Without Destructuring
    println("Samuel has the ${samuel.name} and the age ${samuel.age}")

    // With Destructuring
    val (name, age) = samuel
    println("Samuel has the $name and the age $age")
}
