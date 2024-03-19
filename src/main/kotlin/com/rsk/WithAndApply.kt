package com.rsk

import java.time.LocalDate

class Meeting {
    var Title: String = ""
    var When = LocalDate.MIN
    var Who = mutableListOf<String>()

    fun create() {}
}

fun main() {

    val boardMeeting = Meeting()
    with(boardMeeting) {
        this.Title = "Board Meeting"
        When = LocalDate.now()
        Who.add("Abid")
        Who.add("Alvin")
        val participants = listOf("Awais", "Umar", "Choi")
        Who.add(participants.joinToString(", "))
    }

    boardMeeting.apply {
        Title = "Board Meeting"
        When = LocalDate.now()
        Who.add("Abid")
    }.create()

    println("Meeting: Title: ${boardMeeting.Title}, held at ${boardMeeting.When} and participants are ${boardMeeting.Who} ")

}
