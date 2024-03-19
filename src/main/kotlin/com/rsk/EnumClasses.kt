package com.rsk

enum class ErrorCodes(val error: Int) {
    None(0),
    Unknown(1),
    ConnectionLost(300),
    HttpError(400),
}

fun main() {
    val errorCode = ErrorCodes.ConnectionLost

    when(errorCode) {
        ErrorCodes.None -> println("No error")
        ErrorCodes.Unknown -> println("Unknown error")
        ErrorCodes.ConnectionLost -> println("Connection lost")
        ErrorCodes.HttpError -> println("HTTP error")
    }

    println("ErrorCode has neme ${errorCode.name} and it has ordinal ${errorCode.ordinal} and has value ${errorCode.error}")

    val error = ErrorCodes.valueOf("ConnectionLost")
    println("Error has name ${error.name} and it has ordinal ${error.ordinal}, and has value ${error.error}")
}
