class P33
{
	public static void main(String[] args)
	{
		for(int i=5;i>0;i--)
		{
			for(int j=i;j<5;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j>0;j--)
			{
				System.out.print("* ");
			}
			if(i>1)
			System.out.println();
		}
				for(int i=0;i<5;i++)
		{
			for(int j=4;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			if(i<4)
			System.out.println();
		}
	}
}
