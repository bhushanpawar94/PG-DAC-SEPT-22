import java.util.*;
class Q12
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		int sqr=num*num;
		
		int cube=num*num*num;
		
		int fourthpower=num*num*num*num;
		
		System.out.println("Square of "+num+" is "+sqr+" \ncube of "+num+" is "+cube+"\nFourth power of "+num+" is "+fourthpower);
	}
}