import java.util.*;

class Q2
{
public static void main(String[] args)
{
	System.out.println("Enter the Radius in meters");
	Scanner sc= new Scanner(System.in);
	float radius = sc.nextFloat();
	
	final float pi = 3.14f;
	
	float circumOfcircle = (pi * 2 * radius);
	
	System.out.println("Circumfarence of circle is : "+circumOfcircle+" sq.mtr");
}
}
