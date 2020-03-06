@file:JvmName("MyCustomFileName")

package com.MyKotlen

import com.MyJava.Interoperability

fun main(args:Array<String>)
{
    var g= Interoperability.sum2(32,32)
println("The area of the rectangle is $g")
}
fun sum(a:Int,b:Int):Unit
{
println ("The com.MyKotlen.sum of these two numbers $a and $b is ${a+b}")
}

/**
 * we can also use another saytax like
 * @file.JvmName("MyFirstCoustemFileName")
 * then we can call the kotlen fxns from the java class using this name MyCustomFileName
 * like int java class -> MyCustomFileName.com.MyKotlen.sum;
 *
 */
