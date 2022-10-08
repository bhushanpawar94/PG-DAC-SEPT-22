import java.util.Scanner;

class Q15
{
	public static void main(String args[])
	
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Four digit Number");
		int a = sc.nextInt();
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
		b=a/1000;// 9 number
		c=a%1000;//361 number
		d= c/100;// 3 number
		e=c%100;//61 number
		f=e/10; // 6
		g= e%10; //1
		System.out.println("YOU HAVE ENTRED NUMBER ::"+b+d+f+g); // DISPLAY FACE VALUE
		System.out.println("Place value of no is "+ b+" "+d+" "+f+" "+g+" " );//Place Value
		System.out.println("Reverse no for entred number is "+g+" "+f+" "+d+" "+b+" " );//Rev no.
    	

	}
}
		
	