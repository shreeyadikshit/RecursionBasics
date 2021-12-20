package com.RecursionBasics;
import java.util.Scanner;

/* Program for printing the instructions of building Tower of Hanoi i.e.
   move disks from tower 1 to tower 2 using tower 3.

    Rules are:-
    1. Move 1 disk at a time.
    2. Never place a smaller disk under a larger disk.
    3. You can only move a disk at the top.
*/

public class TowerOfHanoi
{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);

        System.out.println("ENTER TOTAL NO. OF DISKS");
        int n= scn.nextInt();

        System.out.println("ENTER THE ID FOR THE TOWERS ON WHICH TO PLACE THE DISKS");
        int t1= scn.nextInt();
        int t2= scn.nextInt();
        int t3= scn.nextInt();

        toh(n, t1, t2, t3);
    }
    public static void toh(int n, int t1, int t2, int t3)
    {
        if(n == 0)
        {
            return;
        }
        toh(n-1,t1,t3,t2);                                 // Call for moving from n-1 disks tower 1 to 3 using 2.

        System.out.println(n + " " + t1 + "->" + " " + t2);   // Placing nth disk on tower 2.

        toh(n-1,t3,t2,t1);                                 // Placing n-1 disks from 3 to 2 using 1,thus reaching goal state.

    }
}
