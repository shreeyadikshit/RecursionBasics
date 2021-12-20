package com.RecursionBasics;
import java.util.Scanner;

/* Prints the euler path or zig-zag path.
Here shown in form of pre,in and post. */
public class ZigZag
{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        zigzag(n);
    }
    public static void zigzag(int n)
    {
        if(n == 0)
        {
            return;
        }
        System.out.println("Pre" + n);
        zigzag(n-1);

        System.out.println("In" + n);
        zigzag(n-1);

        System.out.println("Post" + n);

    }
}
