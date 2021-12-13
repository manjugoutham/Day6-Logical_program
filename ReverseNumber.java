package day6;

import java.util.Scanner;

public class ReverseNumber 
{  
    public static void main (String[]args)
    {
	        Scanner scan = new Scanner (System.in);

	        System.out.print ("Enter number of values: ");
	        
	        int num = scan.nextInt ();

	        System.out.print ("Reverse of " + num + " is :");
	        
	        int reverse = 0;
	        while(num != 0)
	        {
	            int remainder = num % 10;
	            reverse = reverse * 10 + remainder;
	            num = num/10;
	        }
	        System.out.print (reverse);
	    }
	}