package com.rsk


data class Point(val x: Int, val y: Int) {

//    fun add(point: Point): Point {
//        return Point(this.x + point.x, this.y + point.y)
//    }

//    infix fun add(point: Point): Point {
//        return Point(this.x + point.x, this.y + point.y)
//    }

}

// this function can be defined as extension function as well
//infix fun Point.add(point: Point): Point {
//    return Point(this.x + point.x, this.y + point.y)
//}

// and this can be converted to an expression function as well
//infix fun Point.add(point: Point) = Point(this.x + point.x, this.y + point.y)

// overriding the built-in operators functions
operator fun Point.plus(point: Point) = Point(this.x + point.x, this.y + point.y)
operator fun Point.minus(point: Point) = Point(this.x - point.x, this.y - point.y)
operator fun Point.times(point: Point) = Point(this.x * point.x, this.y * point.y)
operator fun Point.div(point: Point) = Point(this.x / point.x, this.y / point.y)

// infix operator function
//infix operator fun Point.unaryMinus() = Point(-x, -y)

// infix operator function
//infix operator fun Point.compareTo(point: Point) =
//        if (this.x == point.x && this.y == point.y)
//            0
//        else
//            1

// infix operator function
//infix operator fun Point.get(index: Int): Int {
//    return when (index) {
//        0 -> x
//        1 -> y
//        else -> throw IndexOutOfBoundsException("Invalid coordinate $index")
//    }
//}

fun main() {
//    val p1 = Point(10, 20)
//    val p2 = Point(30, 40)
//    val p3 = p1.add(p2)
//    println(p3)


//    val p4 = Point(10, 20)
//    val p5 = Point(30, 40)
//    val p6 = p4 add p5
//
//    println(p6)

    val p4 = Point(10, 20)
    val p5 = Point(30, 40)
    val p6 = p4 + p5

    println(p6)

}
