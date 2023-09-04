package com.MyKotlen

fun main(args:Array<String>)
{
    var str1:String="hello "
    var str2:String="world "
    var str4:String="I'm "
    var str5:String="New here "

    var str3:String="Hey "
    println(str3.extention_fxn(str1,str2,str4,str5))

    //var b:Int=23
    var a:Int=4



    println(a.integerValue(a))

}
fun String.extention_fxn(s1:String,s2:String,s4:String,s5:String):String
{
    return this+s1+s2+s4+s5
}

fun Int.integerValue(a:Int):Int
{
    if(this >a)
    return this
    // println("greater")
    else
        return a

}

/*
fun MyClass.isScholar(a:Int):Boolean
{
    return a>90
}
class MyClass
{
    fun isPassed (a:Int):Boolean
    {
     return a>40
     }
 }
 */
