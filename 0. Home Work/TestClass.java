import java.util.Scanner;
import java.lang.Exception;
class TestClass
{
		static void solve (int arr[]) throws Exception{
		int ans = 0;
		for (int i =0; i<10; i++)
			for (int j=i+1;j<10;j++)
			ans+=arr[i]/arr[j];
			throw new MyException(ans);
		}

public static void main(String args[])
{
	try
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int []arr= new int [n];
		in.nextLine();
		for(int i =0; i<10;i++)
			
			arr[i]= Integer.parseInt(in.nextLine());
		
		String s = in.nextLine();
		
		System.out.println(s.charAt(10));
		solve(arr);
	}
	
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("FORMAT MISMATCH");
	}
	catch(NumberFormatException e)
	{
		System.out.println("FORMAT MISMATCH");
	}
     catch(StringIndexOutOfBoundsException e)
	{
		System.out.println("Index INVALID");
	}
	
	catch(ArithmeticException e)
	{
		System.out.println("INVALID DIVISON");
	}
	
	catch(MyException e) // this is child order is child is first then parent
	{
		System.out.println(e.getMessage());
	}
	 catch(Exception e) //parent needs here first
	{
		System.out.println("Exception Encountered Here");
	} 
	
	finally
	{
		System.out.println("EXCEPTION HANDLING COMPLETED HERE AT THIS POINT");
	}
	
}
}	
class MyException extends Exception{
private int details;
MyException(int a)
{
	details = a;
}
public String toString()
{
	return "MyException["+details+"]";
}
}