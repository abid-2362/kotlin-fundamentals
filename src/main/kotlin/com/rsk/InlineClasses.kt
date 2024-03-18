package com.rsk


@JvmInline
value class Score(val score: Int) {
    init {
        if (score < 0 || score > 100) throw IllegalArgumentException("Invalid score")
    }
}

class Exam {
    fun score(name: String, studentScore: Score) {

        println("Name: $name, Score: $studentScore")
        // ...
    }

    fun amendScroe(id: Int, newScore: Score) {

        // ...
    }
}

fun main() {
    val score = Score(90)
    val exam = Exam()

    exam.score("Math", score)
}
