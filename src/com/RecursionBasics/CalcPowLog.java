package com.RecursionBasics;
import java.util.*;

//More efficient way to calculate power in log(n) time complexity.
public class CalcPowLog
{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the numbers x & n to calculate x^n");

        int x = scn.nextInt();
        int n = scn.nextInt();
        int res = pow(x,n);
        System.out.println(res);
    }

    public static int pow(int x,int n)
    {
        if(n == 0)
        {
            return 1;
        }
        int p = pow(x,n/2);
        int xp = p * p;
        if( n % 2 == 1 )
        {
            xp = xp * x;
        }
        return xp;
    }
}
