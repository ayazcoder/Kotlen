package com.MyJava;

import com.MyKotlen.Default_FunctionsKt;
import kotlin.jvm.JvmOverloads;

public class Default_fxn_java
{

    public static void main(String[] args) {
        System.out.println(Default_FunctionsKt.area(4,665,7));
    }
    @JvmOverloads
    public static int area2(int a, int b,int c)
    {
        return a*b*c;
    }



}
