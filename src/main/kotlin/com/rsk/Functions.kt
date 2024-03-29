package com.rsk

fun padding(original: String, numberToReplace: Int, replacementChar: Char = '*'): String {
    val strToAdd = replacementChar.toString().repeat(numberToReplace)
    return original + strToAdd
}

fun addPlayer(name: String, highScore: Int, lowScore: Int, totalScore: Int = 1000) {

}

// function overloading
fun addPlayer(firstName: String, lastName: String, highScore: Int, lowScore: Int, totalScore: Int) {
    addPlayer("$firstName $lastName", highScore = highScore, lowScore = lowScore, totalScore = totalScore)
}

// Single Expression functions
fun max(a: Int, b: Int) = if (a > b) a else b


// Extension function
fun String.pad(numberToReplace: Int, replacementChar: Char = '*'): String {
    val strToAdd = replacementChar.toString().repeat(numberToReplace)
    return this + strToAdd
}

fun main() {

    val name = "Abid"
    val namePadded = padding(name, 5, '=')
    println("*****$namePadded*****")

    // -------
    addPlayer(name = "Abid", lowScore = 0, highScore = 100, totalScore = 150)

    println(max(23, 42))

    // calling extension function
    val newerString = name.pad(20, '=')
    println(newerString)
}
