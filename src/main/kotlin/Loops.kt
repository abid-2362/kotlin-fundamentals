fun main() {
    val people = HashMap<String, Int>()

    people["John"] = 20
    people["Jane"] = 25
    people["Bob"] = 30

    for ((name, age) in people) {
        println("$name is $age years old")
    }
}

fun overArray() {
    val nums = arrayOf(1, 5, 7, 8, 19, 34)

    for (num in nums) {
        println("Number: $num")
    }

    println("==========")

    for ((index, num) in nums.withIndex()) {
        println("Number: $num at $index")
    }
}

fun ranges() {
    var count = 5

    while (count > 1) {
        println("Always printed $count")
        count--

        if (count > 3) continue
        println("Sometimes printed $count")
    }

    println("=========")

    for (i in 1..10) {
        println("i is $i")
    }

    println("=========")

    for (i in 1..10 step 2) {
        println("(step) i is $i")
    }

    println("=========")

    for (i in 10 downTo 1) {
        println("(down) i is $i")
    }
}
