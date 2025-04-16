package org.example

fun hello() {
    return println("Hello, world!")
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun printMessageWithPrefix(message: String, prefix: String) {
    println("[$prefix] $message")
}

val upperCaseString: (String) -> String = {text -> text.uppercase()}


fun main() {
    printMessageWithPrefix("Log", "Hello")
    printMessageWithPrefix(prefix = "Log", message = "Hello")

    val upperCaseString = {text:String -> text.uppercase()}
    println(upperCaseString("hello"))

    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val positives = numbers.filter { x -> x > 0 }
    println(positives)

    val isNegative = {x : Int -> x < 0}
    val negatives = numbers.filter(isNegative)
    println(negatives)

    val doubled = numbers.map { x -> x * 2 }
    println(doubled)
}
