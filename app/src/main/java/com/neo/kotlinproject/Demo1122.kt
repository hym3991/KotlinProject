package com.neo.kotlinproject

import strings.lastChar

/**
 * @author: hongyaming
 * @date: Create in 14:42 2019-11-22
 * @description: please add a description here
 */
val list = arrayListOf(1,2,3,4)

fun main() {
    //显式表明参数名称
    list.jsonToString(separator = ";", prefix = ",", postfix = ".")

    list.jsonToString()
    list.jsonToString(postfix = " ")

    val c = "Kotlin".lastChar()

    println("Kotlin".lastChar)
}

fun <T> Collection<T>.jsonToString(
    separator:String = ";",
    prefix:String = "",
    postfix:String = ""
):String
{
   val result = StringBuilder(prefix)
    for ((index,element) in withIndex()){
        if (index > 0)result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}