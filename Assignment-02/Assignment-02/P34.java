class P34
{
	public static void main(String[] args)
	{
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(j==0) 	
					System.out.print("*");
				else if(i==4)	
					System.out.print("*");
				else if(i==j)	
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
		
		
	}
}
