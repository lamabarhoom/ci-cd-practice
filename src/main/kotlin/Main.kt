package org.example

fun add(a: Int, b: Int): Int {
    return a + b
}

fun isEven(a: Int): Boolean {
    return a % 2 == 0
}

fun main() {
    val result = add(3, 5)
    println("Result: $result")

    println("is it even? ${isEven(4)}")
}