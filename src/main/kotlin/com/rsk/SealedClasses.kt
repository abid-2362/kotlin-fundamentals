package com.rsk

sealed class PersonEvents(val id: Int) {
    // Sealed class can have its own properties and methods
//    val name = "Sealed"
//    fun doSomething()

    // we can create derived classed right inside the sealed class
    class Awake(id: Int) : PersonEvents(id)
    class Asleep(id: Int) : PersonEvents(id)
    class Eating(id: Int, val food: String) : PersonEvents(id)

}

// we can also create the class outside of the sealed class, but that should be in the same file.
class Cooking(id: Int): PersonEvents(id) {
    fun cook() {

    }
}

fun main() {
    val evt = PersonEvents.Awake(1)
    handlePersonEvent(evt)

    val evt1 = PersonEvents.Eating(2, "Burger")
    handlePersonEvent(evt1)
}

fun handlePersonEvent(evt: PersonEvents) {
    when (evt) {
        is PersonEvents.Awake -> println("ID: ${evt.id}, Awake")
        is PersonEvents.Asleep -> println("Asleep")
        is PersonEvents.Eating -> println("ID:${evt.id} Eating ${evt.food}")
        is Cooking -> println("Cooking")
    }
}
