// https://todaytech.substack.com/p/the-difference-between-and-and-and

package tech.bumbii

fun main() {
    testLogicalAnd()

    testBitwiseAnd()
}

fun testLogicalAnd() {
    val a = false
    val b = true

    // Because a = false, Kotlin skip checking b
    if (a && b) {
        println("This won’t print because b is false.")
    }
}

fun testBitwiseAnd() {
    val x = 5  // Binary: 0101
    val y = 3  // Binary: 0011

    println(x and y) // Output: 1 (Binary: 0001)
}