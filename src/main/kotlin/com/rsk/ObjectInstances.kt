package com.rsk

interface MouseListener {
    fun mouseClicked(e: MouseEvent) {}
    fun mouseEntered(e: MouseEvent) {}
}

fun main() {
//    val simple = object {
//        val name = "Abid"
//
//        fun printName() = println(name)
//    }
//
//    println(simple.name)
//    simple.printName()

    val window = Window()

    window.addMouseListener(object : MouseListener {

        override fun mouseClicked(e: MouseEvent) {

        }

        override fun mouseEntered(e: MouseEvent) {

        }
    })
}


class Window {
    fun addMouseListener(mouseListener: MouseListener) {
        println("Added")
    }
}



class MouseEvent {}
