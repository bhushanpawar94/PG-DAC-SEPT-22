class TwoDArray
{
	public static void main(String args[])
	{
		int a[]={1,2,3,99,89,33};
		int b[]={4,7,8,55,67};
		int c[]={5,6,9,33};
	int d[]= {5,6,7};
		
		int a1[] [] = new int [4] [2];
		
		for (int i=0;i<a1.length;i++)
		{
			for (int j=0; j<a1[i].length;j++)
			{	System.out.print(a1[i][j]+" ");
			}
			System.out.println("*");
		}
		
		a1[0]=a;
		a1[1]=b;
		a1[2]=c;
		a1[3]=d;
		
		/*for ( int x : a1[0])
		{
		System.out.print(x);}*/
		
		
		
		
		
		for (int i=0;i<a1.length;i++)
		{
			for (int j=0; j<a1[i].length;j++)
			{	System.out.print(a1[i][j]+" ");
			}
			System.out.println("*");
		}
		//System.out.print(a1.length);
	}
}