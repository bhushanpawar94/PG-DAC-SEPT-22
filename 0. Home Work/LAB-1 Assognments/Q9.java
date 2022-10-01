//WAP that reads a number in inches,convert meters.
import java.util.Scanner;

class Q9 
{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the Value in Inches");
	
		float inches = sc.nextFloat();
	
			// One inch is 0.0254 meter.
	
		float conversion = inches * 0.0254f;
	
		System.out.println(inches +" inch is"+ conversion+" meters");
	}
}
	
	