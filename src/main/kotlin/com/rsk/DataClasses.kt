package com.rsk

data class Person(val name: String, val age: Int) {

}

fun main() {
    val sam = Person("Sam", 31)
    val samuel = Person("Sam", 32)

    println("$sam has hashcode ${sam.hashCode()}")
    println("$samuel has hashcode ${samuel.hashCode()}")

    if(sam.equals(samuel)) {
        println("Sam and Samuel are equal")
    } else {
        println("Sam and Samuel are not equal")
    }
}
