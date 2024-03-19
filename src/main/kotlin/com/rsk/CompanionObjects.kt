package com.rsk


class Invoice {
    companion object Logger {
        fun debug(message: String) = println("** Debug:  ($this) $message")
    }
    fun calculate() {
        debug("Calculating Invoice")
    }
}

fun main() {
    val invoice = Invoice()
    invoice.calculate()

    val invoice2 = Invoice()
    invoice2.calculate()

    Invoice.debug("Called from main like a static")
//    Invoice.Logger.debug("Called from main")
}
