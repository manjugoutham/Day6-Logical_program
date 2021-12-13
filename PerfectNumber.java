package day6;
import java.util.Scanner; 

public class PerfectNumber  
   {  
 
    static long Number(long num)  
     {  
      
      long sum=0;  
  
      for(int i=1; i <= num/2; i++)  
      {  
         if(num % i == 0)  
         {  
         sum=sum + i;  
         }   
      }    
      return sum;   
    }  
    
    public static void main(String args[])    
    {  
    	long n, s;  
    	Scanner sc=new Scanner(System.in);         
    	System.out.print("Enter the number: ");   
    	n=sc.nextLong();   
    	s = Number(n);  
    	
    	if(s==n)  
    		System.out.println(n +" is a perfect number");  
    	else  
    		System.out.println(n +" is not a perfect number");   
    }   
}  