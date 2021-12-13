package junit;

import java.util.Scanner;

public class TemperaturConversion 
{
	public static void main(String arg[])	
	{
	    double fah,cel;
        Scanner sc=new Scanner(System.in);
	    System.out.println("Choose type of conversion \n 1.Fahrenheit to Celsius  \n 2.Celsius to Fahrenheit");
        int ch=sc.nextInt();
        
	    switch(ch)
	    {
	    case 1:  System.out.println("Enter  Fahrenheit temperature");
                 fah=sc.nextDouble();
                 cel=(fah-32)*5/9;
                 System.out.println("Celsius temperature is = " +cel);
                 break;
                 
	    case 2:  System.out.println("Enter  Celsius temperature");
                 cel=sc.nextDouble();
                 fah=(cel*9/5)+32;
                 System.out.println("Fahrenheit temperature is = " +fah);
                 break;
                 
	   default:  System.out.println("please choose valid choice");
	   
	   }  
	} 
}