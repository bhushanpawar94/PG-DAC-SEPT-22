public class UniqueNumber{
	public static void main(String args[])
	{
		
		for(int i=2;i<=9999;i++)
		{
			if(i%2==0 && i%3==0 && i%4==0 && i%5==0 && i%6==0 && i%7==0 && i%8==0 && i%9==0)
			{
				System.out.println("Num="+i);
			}
		}
	}
}