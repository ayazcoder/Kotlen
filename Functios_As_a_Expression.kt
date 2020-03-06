fun main(args:Array<String>)
{
    var largevalue=max(23,21)
    println("The largest value is $largevalue")

}
//First method to do this
/*fun max(a:Int,b:Int):Int
{
    if (a>b)
        return a
    else
      return b


 */

//second method to do this
//fun max(a:Int,b:Int) :Int=if(a>b) a else b

//if we have multiple statements

fun max(a:Int,b:Int) :Int=

    if(a>b)
    {
        println("$a is greater")
        a
    }
    else
    {
        println("$b id greater")
        b
    }


