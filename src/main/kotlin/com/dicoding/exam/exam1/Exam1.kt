package com.dicoding.exam.exam1

// TODO 1
fun isEvenNumber(number: Int) = number % 2 == 0

// TODO 2
fun moreThanFive(number: Int) = number > 5

// TODO 3
fun result(number: Int) = number * (number + 10)

fun main() {
    val listNumber = 1.rangeTo(100)
    for (number in listNumber) {
        if (isEvenNumber(number)) continue

        if (moreThanFive(number)) break

        val result = result(number)
        println("range result is $result")
    }
}
