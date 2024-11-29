package tech.bumbii.lambda

fun main() {
    val modOperation = { a: Int -> a % 2 == 0}
    print(modOperation(4))
}