fun main(args:Array<String>)
{
    ayaz@for(j in 1..3)
    {
        for(i in 1..3)
        {
            if(i==2 && j==2)
            {
                continue@ayaz
            }
            println("$i $j")
        }
    }

}