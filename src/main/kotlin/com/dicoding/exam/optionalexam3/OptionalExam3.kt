package com.dicoding.exam.optionalexam3

// TODO
fun manipulateString(str: String, int: Int): String =
    if (str.any { it.isDigit() }) str.replace(Regex("\\d+")) { (it.value.toInt() * int).toString() } else "$str$int"
