package org.juventus.seo2.lambda

import java.text.SimpleDateFormat
import java.util.*

val dateToString: (Date) -> String = {
    val formatter = SimpleDateFormat("yyy-MM-dd")
    "The date is: " + formatter.format(it)
}

fun operate(a: Int, b: Int, operator: (Int, Int) -> Int): Int {
    return operator(a,b)
}