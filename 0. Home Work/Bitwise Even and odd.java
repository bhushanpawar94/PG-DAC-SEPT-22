public class Bitwise Even and odd // Bitwise Even and odd 
{ 
	static boolean isEvenOr(int n)
	{
		System.out.println((n | 1));
		if((n | 1) > n)
			return true;
		else
			return false;
	}
	
	static boolean isEvenAnd(int n)
	{
		System.out.println((n & 1));
			return ((n & 1)!=1);
	}
	public static void main(String args[])
	{
		int m = 4;
		int n = 3;
		System.out.println(isEvenOr(m) == true ? "Even" : "Odd");
		System.out.println();
		System.out.println(isEvenAnd(n) == true ? "Even" : "Odd");
	}
}