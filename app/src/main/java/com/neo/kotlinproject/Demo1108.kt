package com.neo.kotlinproject

/**
 * @author: hongyaming
 * @date: Create in 15:50 2019-11-08
 * @description: please add a description here
 */
object Demo1108 {

    val PI = 3.14
    var x = 0
    val result = double(2)

    private fun double(i: Int): Any {
        return  2 * i
    }


    @JvmStatic
    fun main(args: Array<String>) {
        println("hello world"+sum1(1,2))

        //只读 只赋值一次
        val a: Int = 1
        val b = 2
        val c: Int
        c = 3
        //只读 只赋值一次

        //可重新赋值
        var e = 5
        e += 1
        //可重新赋值

    }

    fun sum(a : Int, b : Int):Int{
        return a+b
    }

    fun sum1(a:Int,b:Int) = a + b

    fun incrementX(){
        x += 1
    }

    //函数参数可以有默认值，当省略相应的参数时使用默认值
    fun read(b:Array<String>,off:Int = 0,len:Int = b.size){

    }

    fun maxOf(a:Int,b:Int):Int? = if (a > b) a else b

    fun getStringLength(obj:Any):Int?{
        if (obj is String){
            return obj.length
        }
        return null
    }
    val items = listOf<String>("a","v","w")
    val items2 = listOf(1,1,"2")

}
