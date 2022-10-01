

import java.util.Scanner;

class Q11
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number between 0 to 1000");
		
		int num = sc.nextInt();
		
		int rem, sum =0 ;
		
		while(num>0) 
		{
			if(num>1000)
			{
				System.out.println ("Invalid Entry");
				break;
			}
			else
			{
			rem = num % 10 ;			// 987 %10 = 7 , 987/10 = 98 , 98%10 = 8,  98/10=9 
			
			sum = sum + rem ; 
			
			num = num / 10 ;
			}
		}
		if(sum>0)
		{
		
		System.out.println("Addition of the Entered number is : "+sum);
		
		}
		
	}
}