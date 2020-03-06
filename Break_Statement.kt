fun main(args:Array<String>)
{
    //var a:Int
    myLoop@ for(a in 1..3) {
        for (b in 1..3) {

            println("$a $b")
            if(a==2 && b==1)
                break@myLoop

        }

    }
}