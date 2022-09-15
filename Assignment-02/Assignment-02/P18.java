class P18
{
	public static void main(String [] args)
	{
		
		for(int i=5;i>=0;i--)
		{
			for(char j='A';j<=(char)('A'+i);j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
}
