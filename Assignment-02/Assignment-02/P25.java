class P25
{
	public static void main(String[] args)
	{
	
		for(int i=5;i>0;i--)
		{
			for(int j=i;j<5;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<i*2;j++)
			{
				System.out.print("*");
			}
			if(i>1)
			System.out.println();
		}
	}
}