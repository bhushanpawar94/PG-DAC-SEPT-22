/*Write a Java program to compute body mass index (BMI). 
Test Data Input weight in pounds: 452 
Input height in inches: 72
Expected Output: Body Mass Index is 61.30159143458721

1kg=2.20462pound



*/

import java.util.Scanner;

class Q13
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		float weight=sc.nextFloat();
		
		float height=sc.nextFloat();
		
		float m1=height*0.0254f;
		
		float wp=weight*0.45359237f;
		
		double BMI=wp/(m1*m1);
		
		System.out.println("BMI=> "+BMI);
	}
}




