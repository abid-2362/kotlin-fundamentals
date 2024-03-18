package com.rsk

fun main() {
    println("Started...")

    val logger: Logger = NullLogger()

    val earth = Planet("Earth", 12742, logger)
    println("Planet created: Name: ${earth.name}, radius: ${earth.radius}")
    earth.population = 7_000_000_000
    println("${earth.name} Population: ${earth.population}")

    val newPopulation = earth.runPopulationModel(0, 1000, 100)

    println("New population is $newPopulation")
}
