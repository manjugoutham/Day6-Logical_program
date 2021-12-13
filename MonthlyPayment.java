package junit;
import java.util.Scanner;

public class MonthlyPayment 
{


    public static void main(String []args)
    {
        Scanner a = new Scanner(System.in);

        double p, r, time, emi,m=12,y;

        System.out.print("Enter principal amount : ");
        p = a.nextFloat();

        System.out.print("Enter rate: ");
        r = a.nextFloat();

        System.out.print("Enter time in year: ");
        y = a.nextFloat();

        r=r/(12*100);
        time=y*12;


        emi= (p*r*Math.pow(1+r,time))/(Math.pow(1+r,time)-1);
        
       // emi = ((p *r)/(1-(1+r)-Math.pow(m,y)));

        System.out.print("Monthly EMI is= "+emi+"\n");

    }
}