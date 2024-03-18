package com.rsk

import kotlin.math.log


abstract class SpaceBody(val name: String) {
    abstract fun calculateMotion()
}

class BlackHole(name: String) : SpaceBody(name) {
    override fun calculateMotion() {
        println("Black Hole $name is moving")
    }
}

open class Planet(name: String, diameter: Int, val logger: Logger) : SpaceBody(name) {
    open var population: Long = 0

    init {
        println("Planet Created: $name, $diameter")
        population = 0
    }

    val radius: Int = diameter / 2


    constructor(name: String, diameter: Int, gaseous: Boolean, logger: Logger) : this(name, diameter, logger)
    constructor(name: String, diameter: Int, gaseous: Boolean, hasLife: Boolean, logger: Logger) : this(name, diameter, logger)

    private fun initPopulationRun(startDate: Int, endDate: Int, startPopulation: Long) {
        // do some task
    }

    override fun calculateMotion() {
        println("Planet $name is moving")
    }

    open fun runPopulationModel(startDate: Int, endDate: Int, startPopulation: Long): Long {
        logger.debug("Starting the model")
        initPopulationRun(startDate, endDate, startPopulation)
        return population
    }
}

class HabitablePlanet(name: String, diameter: Int, logger: Logger) : Planet(name, diameter, logger) {

    override var population: Long = 0
    override fun runPopulationModel(startDate: Int, endDate: Int, startPopulation: Long): Long {
        super.runPopulationModel(startDate, endDate, startPopulation)
        return 0
    }
}
