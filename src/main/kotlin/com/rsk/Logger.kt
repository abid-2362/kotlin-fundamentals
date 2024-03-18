package com.rsk

interface Logger {
    fun debug(message: String)
    fun info(message: String)
    fun warn(message: String)
    fun error(message: String)
}

class StdoutLogger : Logger {
    override fun debug(message: String) {
        println("[DEBUG] $message")
    }

    override fun info(message: String) {
        println("[INFO] $message")
    }

    override fun warn(message: String) {
        println("[WARN] $message")
    }

    override fun error(message: String) {
        println("[ERROR] $message")
    }
}

class NullLogger: Logger {
    override fun debug(message: String) {}
    override fun info(message: String) {}
    override fun warn(message: String) {}
    override fun error(message: String) {}
}
