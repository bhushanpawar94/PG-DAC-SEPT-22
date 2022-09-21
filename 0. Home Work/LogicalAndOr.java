public class LogicalAndOr// Logical And & Or
{ 

	public static void main(String args[])
	{
		int a=10, b=20, c=20, d=0;
		//System.out.println("");
		if((a == c)&&(a++ < b)){
			d=a+b+c;
			System.out.println("Addition="+d);
			System.out.println(a);
		} 
		else
		{
			System.out.println("Failed");
		}
		
	}
}