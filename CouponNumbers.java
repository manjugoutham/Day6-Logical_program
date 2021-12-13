package day6;

import java.util.Random;
import java.util.Scanner;

public class CouponNumbers {
	public static void main(String[] args) 
	{
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);

		System.out.print ("How many random numbers do you need to generate");
        int coupon = scan.nextInt ();

		for (int i = 1 ; i <= coupon; i++) 
		{
			if (i!=0) 
			{
			int CouponCode = ran.nextInt(100);
			System.out.println("CouponNumber is : "+i);
			System.out.println(CouponCode);
			}
			else{
				System.out.println(" Invalid input ");
				break;
			}
		}
	}
}