package org.juventus.seo2

import org.juventus.seo2.lambda.dateToString
import org.juventus.seo2.lambda.operate
import org.juventus.seo2.stream.streamNumberList
import org.juventus.seo2.stream.streamNumberListDebug
import org.juventus.seo2.stream.streamPersonList
import java.util.Date

fun main() {
    println(dateToString(Date()))

    println(operate(1, 2) { a, b -> a + b })
    println(operate(2, 1) { a, b -> a - b })
    println(operate(2, 5) { a, b -> a * b })
    println(operate(6, 2) { a, b -> a / b })

    println("=====Debug====")
    streamNumberListDebug()
    println("=========")
    println("=====Short Hand====")
    streamNumberList()
    println("=========")
    streamPersonList()
}