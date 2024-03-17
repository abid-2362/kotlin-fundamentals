fun main() {
    val nums = arrayOf(5)

    try {
        val num = nums[1]
    } catch (t: Throwable) {
        println(t.message)
    }

    // we can also assign the value from try catch like if else
    val ans = try {
        nums[1]
    } catch (t: Throwable) {
        0
    }

    println("The answer is $ans")

    try {
        throwException()
    } catch (t: Throwable) {
        println(t.message)
    } finally {
        println("This is the finally block")
    }
}


fun throwException() {
    throw Exception("This is an exception")
}
