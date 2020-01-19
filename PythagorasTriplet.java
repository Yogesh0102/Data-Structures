import java.util.*;
import java.lang.Math;
public class PythagorasTriplet 
{
	public static void find(int arr[],int n)
	{
		Arrays.sort(arr);
		int flag=0;
		int i,j;
		for(i=0;i<n;i++)
		{
			int c=arr[i]*arr[i];
			for(j=0;j<n-1;j++)
			{
				if(Math.pow(arr[j],2)+Math.pow(arr[j+1],2)==c)
				{
					flag++;
				}
			}
		}
		if(flag>0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number of test cases => ");
		int t=s.nextInt();
		int i,j;
		System.out.print("Enter the size of array => ");
		for(i=0;i<t;i++)
		{
			int n=s.nextInt();
			int a[]=new int[n];
			System.out.print("Enter the elements of array => ");
			for(j=0;j<n;j++)
			{
				a[i]=s.nextInt();
			}
			find(a,n);
		}
	}
}