package org.juventus.seo2.stream

import org.juventus.seo2.model.Person

fun streamNumberListDebug() {
    val numberLists: List<List<Int>> = listOf(listOf(2,1,1,3,4,4))
    println(numberLists)
    val transformedList: List<Int> = numberLists.flatMap { it.toList() }
    println("Converted")
    println(transformedList)

    val multipliedList = transformedList.map { it * 2 }
    println("Multiplied")
    println(multipliedList)

    val noDuplicatedList = multipliedList.distinct()
    println("No duplicates")
    println(noDuplicatedList)

    val sortedList = noDuplicatedList.sorted()
    println("Sorted")
    println(sortedList)
}

fun streamNumberList() {
    val numberLists: List<List<Int>> = listOf(listOf(2,1,1,3,4,4))
    println(numberLists)
    val updatedList = numberLists.flatMap { it.toList() }.map { it * 2 }.distinct().sorted().toList()
    println(updatedList)
}

fun streamPersonList() {
    val personList = listOf(Person("Tim", 20), Person("Peter", 30), Person("Ali", 18))
    println(personList.filter { it.name.startsWith("A") }.all { it.age > 18 })
}

