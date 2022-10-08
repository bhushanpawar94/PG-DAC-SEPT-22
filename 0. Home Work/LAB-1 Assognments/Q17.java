// PROGRAM TO CONVERT STRING INTO ARRAY

import java.util.*;

class Q17 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the String");
		
		String S1 = sc.nextLine();
		
		char arr [] = S1.toCharArray();
		
		Arrays.sort(arr);
		
		for (int b = 0; b < arr.length ; b++)
		{
			System.out.println("The String:"+arr[b]);
			
		}
		
		
		//String S2= new String(arr) ;
		
		 
		 
		String S2 = Arrays.toString(arr);
		
		String S3 = append(arr);
		
		
		System.out.println("The String:"+S2);
		System.out.println("The String:"+arr.length); 
		
		
		
		
		
	}
	
}
		
		