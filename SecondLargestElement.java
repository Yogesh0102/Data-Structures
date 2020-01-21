import java.util.*;
public class SecondLargestElement 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number of the elements in an array = ");
		int n=s.nextInt();
		int i;
		int a[]=new int[n];
		System.out.print("Enter the number of the elements of the array = ");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		System.out.println("Largest - "+a[n-1]);
		System.out.println("Second Largest - "+a[n-2]);
	}
}