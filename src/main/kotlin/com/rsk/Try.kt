package com.rsk

import java.io.Closeable
import java.time.LocalDate

class Meeting2 : Closeable  {
    var Title: String = ""
    var When = LocalDate.MIN
    var Who = mutableListOf<String>()

    fun create() {
        println("Meeting Created")
    }
    override fun close() {
        println("Was Closed")
    }


}

fun main() {

    Meeting2().use {
        it.create()
    }

}
