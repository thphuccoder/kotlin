package tech.bumbii.lambda

fun main() {
    var list = (0..20).toList()
    println(list)

    list = list.filter { it % 2 == 0 }
    println(list)
}