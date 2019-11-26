
@file:JvmName("StringFunctions")
package strings

/**
 * @author: hongyaming
 * @date: Create in 15:07 2019-11-22
 * @description: please add a description here
 */
fun <T> jsonToString(
    collection: Collection<T>,
    separator:String = ";",
    prefix:String = "",
    postfix:String = ""
):String
{
    val result = StringBuilder(prefix)
    for ((index,element) in collection.withIndex()){
        if (index > 0)result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}
//String 接收者类型 this 接收者对象
//拓展方法
fun String.lastChar() : Char = get( this.length-1 )

//拓展属性
val String.lastChar : Char
    get() = get(length - 1)