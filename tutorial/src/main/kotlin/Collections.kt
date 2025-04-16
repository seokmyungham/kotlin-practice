package org.example

fun main() {
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)
    println("The first item in the list is: ${readOnlyShapes[0]}")
    println("The first item in the list is: ${readOnlyShapes.last()}")
    println("This list has ${readOnlyShapes.count()} items")
    println("triangle" in readOnlyShapes)
    println("hi" in readOnlyShapes)

    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    println(shapes)
    shapes.add("hi")
    println("hi" in shapes)

    val readOnlyFruit = setOf("apple", "banana")
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana")

    println(readOnlyFruit)
    println("This set has ${readOnlyFruit.count()} items")
    println("banana" in readOnlyFruit)
    println(readOnlyFruit.contains("banana"))

    fruit.add("pineapple")
    println(fruit)
    fruit.remove("pineapple")
    println(fruit)

    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu)
    println("${readOnlyJuiceMenu["apple"]}")
    println("This map has ${readOnlyJuiceMenu.count()} key-value items")
    println("kiwi" in readOnlyJuiceMenu)
    println("kiwi" in readOnlyJuiceMenu.keys) // kiwi in keySet
    println(readOnlyJuiceMenu.containsKey("kiwi"))
    println(200 in readOnlyJuiceMenu.values)
    println(readOnlyJuiceMenu.any {it.key == "apple" && it.value == 200})
    println(readOnlyJuiceMenu.any {it.key == "apple" && it.value == 100})

    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(juiceMenu)
    juiceMenu["apple"] = 150
    println(juiceMenu)
    juiceMenu.remove("orange")
    println(juiceMenu)
}
