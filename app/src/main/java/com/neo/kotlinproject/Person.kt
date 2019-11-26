package com.neo.kotlinproject

import strings.jsonToString
import java.io.BufferedReader
import java.util.*
/**
 * @author: hongyaming
 * @date: Create in 16:33 2019-11-19
 * @description: please add a description here
 */
//数据类
data class Person(val name: String,
                  val age: Int ? = null)//可空类型 Int?

class People(var age: Int? = 0)

fun main(args:Array<String>) {
    val person = listOf<Person>(Person("Nick",22), Person("Z",18))
    val oldest = person.maxBy {

        // ?: 0 为null就返回0
        it.age ?: 0
    }
    println(max(10,44))
    println("oldest is $oldest")
    println(a.javaClass)
    c = 2
    println(b.javaClass)
    val p1 = People()
    println("age:${p1.age}")
    p1.age = 2
    println("age:${p1.age}")

    val r1 = Ret(33,331)
    println("${r1.isSquare}")

    for (i in 1..100){
        print(fizzBuzz(i))
    }

    usemap()

    println("${'a' !in 'a'..'z'}")

    jsonToString(arrayListOf(1,1,1))
}
val a = 1.01e3//不可变
var c = 1
val b : Int = 20
fun max(a : Int,b:Int)=if(a>b)a else b

class Ret(val he:Int,val wi:Int){
    //属性
    val isSquare : Boolean
        //单独声明getter方法
        get() {
            return he == wi
        }
}
enum class Color(val r:Int,val g:Int,val b:Int){
    RED(255,0,0),
    GREEN(0,255,0),
    BLUE(0,0,255);

    fun rgb() = (r*255+g)*255+b
}

fun fizzBuzz(i:Int) = when {
    i % 15 == 0 ->"FizzBuzz "
    i % 3 == 0 -> "Fizz "
    i % 5 == 0 -> "Buzz "
    else -> " $i "
}
val  binaryReps = TreeMap<Char,String>()
fun usemap(){
    for (x in 'A'..'Z'){
        val binary = Integer.toBinaryString(x.toInt())
        //不使用put存值
        binaryReps[x] = binary
    }
    println(binaryReps)
    //遍历map
    for ((letter,binary) in binaryReps){
        println("$letter = $binary")
    }
}

fun redNumber(a: BufferedReader){
    val  number = try {
        Integer.parseInt(a.readLine())
    }catch (e:NumberFormatException){
    }
}
