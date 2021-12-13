package junit;

import java.util.Scanner;

public class Sqrt
{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        System.out.print("Enter non-negative Number : ");
        double num = sc.nextDouble();
        double c = num;

        double epsilon = 1e-15;

        double t = c;

        while (Math.abs(t - c / t) > epsilon * t)
        {
            t = (c / t + t) / 2.0;
        }

        System.out.println(t);
    }
}

