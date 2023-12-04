
public class prime_number {

	public static void main(String[] args)
	{
		int i,flag=0;
		int n=10;
		int m=n/2;
		if(n==0 || n==1)
		{
			System.out.println("number is not prime");
		}
		else
		{
			for(i=2;i<=m;i++)
			{
				if(n%2==0) {
					System.out.println(n+" number is prime");
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(n+"prime number");
			}
		}
	}

}
