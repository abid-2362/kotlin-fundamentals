package com.rsk

interface Process {
    //    fun execute(value: Int)
    fun execute(value: Int)
}

fun main() {
//    fibonacci(8, object : Process {
//        override fun execute(value: Int) {
//            println(value)
//        }
//    })

//    fibonacci(8, { n -> println(n) })
//    fibonacci(8, { println(it) })
//    fibonacci(8) { println(it) }
//    fibonacci(8, ::println)


    // This is the use of closure to update the value of the total variable
    var total = 0
    fibonacci(8) {
        total += it
    }

    println(total)

}

fun fibonacci(limit: Int, action: (Int) -> Unit) {
    // 1, 1, 2, 3, 5, 8, 13, 21, ...
    var prev = 0
    var prevprev = 0
    var current = 1

    for (i: Int in 1..limit) {
        action(current)

        val temp = current
        prevprev = prev
        prev = temp
        current = prev + prevprev
    }
}

fun fibonacci(limit: Int, process: Process) {
    // 1, 1, 2, 3, 5, 8, 13, 21, ...
    var prev = 0
    var prevprev = 0
    var current = 1

    for (i: Int in 1..limit) {
        process.execute(current)

        val temp = current
        prevprev = prev
        prev = temp
        current = prev + prevprev
    }
}

fun fibonacci(limit: Int) {
    // 1, 1, 2, 3, 5, 8, 13, 21, ...
    var prev = 0
    var prevprev = 0
    var current = 1

    for (i: Int in 1..limit) {
        println(current)

        val temp = current
        prevprev = prev
        prev = temp
        current = prev + prevprev
    }
}
