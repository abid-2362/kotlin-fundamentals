package com.rsk


abstract class SpaceBody(val name: String) {
    abstract fun calculateMotion()
}

class BlackHole(name: String) : SpaceBody(name) {
    override fun calculateMotion() {
        println("Black Hole $name is moving")
    }
}

open class Planet(name: String, diameter: Int) : SpaceBody(name) {
    open var population: Long = 0

    init {
        println("Planet Created: $name, $diameter")
        population = 0
    }

    val radius: Int = diameter / 2


    constructor(name: String, diameter: Int, gaseous: Boolean) : this(name, diameter)
    constructor(name: String, diameter: Int, gaseous: Boolean, hasLife: Boolean) : this(name, diameter)

    private fun initPopulationRun(startDate: Int, endDate: Int, startPopulation: Long) {
        // do some task
    }

    override fun calculateMotion() {
        println("Planet $name is moving")
    }

    open fun runPopulationModel(startDate: Int, endDate: Int, startPopulation: Long): Long {
        initPopulationRun(startDate, endDate, startPopulation)
        return population
    }
}

class HabitablePlanet(name: String, diameter: Int) : Planet(name, diameter) {

    override var population: Long = 0
    override fun runPopulationModel(startDate: Int, endDate: Int, startPopulation: Long): Long {
        super.runPopulationModel(startDate, endDate, startPopulation)
        return 0
    }
}
