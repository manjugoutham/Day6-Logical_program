package day6;

import java.io.*;
import java.util.Scanner;

class Fibonacci
{
    public void findVal()
    {
    	Scanner s1 = new Scanner(System.in);
    	System.out.println("enter the num");
        int num =s1.nextInt();
        
        System.out.println("enter the first num");
        int first =s1.nextInt();
        
        System.out.println("enter the second num");
        int second =s1.nextInt();
        
        int counter = 0, sum;
     
        while (counter < num)
        {
            sum = first + second;
            System.out.print( sum + " ");
            first = second;
            second = sum;
            counter++;
        }
    }
     
    public static void main (String[] args)
    {
        Fibonacci f1 = new Fibonacci();
        f1.findVal();
    }
}