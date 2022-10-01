// integer between 0 and 1000 and adds all the digits in the integer.

import java.util.Scanner;

class Q10
{
	public static void main(String args[])
	{
	
		Scanner sc = new Scanner (System.in);
	
		System.out.println("Enter number in between of 0 to 1000");
	
		int add = sc.nextInt();
	
		int sum = 0;
	
		for (int i = 0 ; i<= add ; i++)
		{
			sum =sum +i;
		}
		System.out.println(sum);
	}
	
}