package com.MyJava;

import com.MyKotlen.MyCustomFileName;

public class Interoperability
{
    public static void main(String[] args)
    {
      MyCustomFileName.sum(32,43);

      //new kotlen file name

        //System.out.println( InterOperabilityKt.add(32,323));
 //       System.out.println("From the java Class the com.MyKotlen.sum is :"+com.MyKotlen.sum);
    }
    public static int  sum2(int length,int bredth)
    {
        int a,b;
        a=length;
        b=bredth;
        return a*b;
    }
}
