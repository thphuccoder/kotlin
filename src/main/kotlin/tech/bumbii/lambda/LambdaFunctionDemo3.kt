package tech.bumbii.lambda

fun main() {
    val add: (Int, Int) -> Int = { a, b -> a + b }
    println(add(1, 2))

    val multiply = { a: Int, b: Int -> a * b }
    println(multiply(1, 2))

    fun performOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
        return operation(a, b)
    }
    println(performOperation(6, 3) { a, b -> a - b })
}