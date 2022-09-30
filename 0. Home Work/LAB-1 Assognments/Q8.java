import java.util.Scanner;

class Q8
{

public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter your salary");
	
	double salary = sc.nextFloat();
	
	double gs,salary1,salary2;
	
	if(salary<10000)
	{
		salary1 = 0.10 * salary;
		 
		salary2 = 0.90 * salary;
		
		gs = salary+salary1+salary2;
		
		System.out.println("Gross salary"+ gs);
		
	}
	
	
	else if(salary>=10000)
	{
		salary2 = 0.98 * salary;
		
		gs = salary+ 2000 + salary2;
		
		System.out.println("Gross salary"+ gs);
		
	}
}
}
