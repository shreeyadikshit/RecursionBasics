package com.RecursionBasics;
import java.util.Scanner;

public class CalcPower
{
    public static void main(String[] args)
    {
        int n,x;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no. to calc power of");
        n = s.nextInt();
        x = s.nextInt();
        int pow = Pow(n,x);
        System.out.println(pow);
    }
    public static int Pow(int n,int x)
    {
        if(x==0)
        {
            return 1;
        }
        int p = Pow(n,x-1);
        return n*p;
    }
}
