package com.IncreasingDecreasing;
import java.util.*;

public class IncreasingDecreasing
{
    public static void main(String[] args)
    {
       Scanner scn=new Scanner(System.in);
       System.out.println("Enter the number to print:");
       int n = scn.nextInt();
       pdi(n);
    }
    public static void pdi(int n)
    {
        if(n==0)
            {
                return;
            }
        System.out.println(n);
        pdi(n-1);
        System.out.println(n);
    }
}
