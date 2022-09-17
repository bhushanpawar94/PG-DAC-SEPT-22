// Program to get Day of the week from Number 
import java.util.Scanner;
class HW1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check Day");
		 int number = sc.nextInt();
		
		//int number= 5;
		
		
		switch(number)
		{
			case 1: System.out.println("Today is Monday");
			break;
			
			case 2: System.out.println("Today is Tuesday");
			break;
			
			case 3: System.out.println("Today is Wednesday");
			break;
			
			case 4: System.out.println("Today is Thursday");
			break;
			
			case 5: System.out.println("Today is Friday");
			break;
			
			case 6: System.out.println("Today is Saturday");
			break;
			
			case 7: System.out.println("Today is Sunday");
			break;
			
		default: System.out.println("Invalid Entry ! Enter number between 1 to 7 only !");
		}
	}
}