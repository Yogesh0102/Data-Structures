package ds;
import java.util.*;
public class RemoveAdjacentDuplicateCharacters 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number of test cases => ");
		int t=s.nextInt();
		for(int i=0;i<t;i++)
		{
			System.out.print("Enter the string => ");
			String str=s.next();
			char c[]=str.toCharArray();
			int n=c.length;
			if(c[0]!=c[1])
			{
				System.out.print(c[0]);
			}
			for(int j=1;j<n-1;j++)
			{
				if(c[j]!=c[j+1]&&c[j]!=c[j-1])
				{
					System.out.print(c[j]);
				}
			}
			if(c[n-1]!=c[n-2])
			{
				System.out.print(c[n-1]);
			}
		}
	}
}