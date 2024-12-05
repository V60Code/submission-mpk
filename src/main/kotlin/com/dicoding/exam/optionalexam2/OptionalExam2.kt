package com.dicoding.exam.optionalexam2

// TODO
fun minAndMax(number: Int) =
    number.toString().map(Character::getNumericValue).let { it.minOrNull()!! + it.maxOrNull()!! }
