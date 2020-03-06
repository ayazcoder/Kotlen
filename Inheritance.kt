package com.classess

fun main(args:Array<String>)
{
     var cat=Cat()
    var dog=Dog()
    println(cat.color)
    println(cat.eat())
    println(dog.color)
    println(dog.eat())



}
open class Animal
{
 open   var color:String="black"
open    fun eat()
    {
        println("animal is eating")
    }

}
class Cat:Animal()
{
override   var color:String="black"

    override fun eat()
    {
        println("animal is eating")
    }

    var age:Int=2
    fun meow()
    {
        println("cat's meow")
    }
}
class Dog:Animal()
{
override    fun eat()
    {
        println("animal is eating")
    }

override    var color:String="black"

    var breed:String="bengal"
    fun bark()
    {
        println("Dog is barking")
    }

}