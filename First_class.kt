package com.classess

fun main()
{

    var obj=MyClass("ayaz",32)
    //obj.name="Khan"
    println(obj.a)
    println(obj.id)
}

class MyClass constructor(var a:String)
{
    var id:Int=-1
    init
    {
         println("name")
    }
    constructor(n:String,id:Int):this(n)
    {
        //the body of the secondary constructot is compile after the init block
        this.id=id
    }

}