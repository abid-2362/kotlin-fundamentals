package com.rsk

object LoggerSingleton {
    fun debug(message: String) {
        println("** Debug: $this $message")
    }

    fun info(message: String) {
        println("** Info: $message")
    }
}

class Person2 {
    fun doWork() {
        LoggerSingleton.debug("I'm working")
    }
}

fun main() {
    val abid = Person2()

    abid.doWork()

    val awais = Person2()
    awais.doWork()
}
