package com.RecursionBasics;
import java.util.*;

public class Factorial
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int fact=factorial(n);
        System.out.println(fact);
    }
    public static int factorial(int n)
    {
        if(n==1)
        {
            return 1;
        }
       int Dec=factorial(n-1);
       return n * Dec;

    }
}
