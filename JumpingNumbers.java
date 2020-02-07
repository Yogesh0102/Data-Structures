import java.util.Scanner;
public class JumpingNumbers 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number of test cases = ");
		int t=s.nextInt();
		int i,j;
		for(i=0;i<t;i++)
		{
			System.out.print("Enter the number = ");
			int n=s.nextInt();
			int d,rem;
			for(j=0;j<=n;j++)
			{
				if(j<=10)
				{
					System.out.print(j+" ");
				}
				else
				{
					d=j/10;
					rem=j%10;
					if(d-rem==1||d-rem==-1)
					{
						System.out.print(j+" ");
					}
				}
			}
		}
	}
}