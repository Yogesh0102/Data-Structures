import java.util.Scanner;
public class MaxContiguousSubarray
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number of elements of array = ");
		int n=s.nextInt();
		int arr[]=new int[n];
		int i,j;
		System.out.print("Enter the elements of array = ");
		for(i=0;i<n;i++) 
		{
			arr[i]=s.nextInt();
		}
		System.out.print("Enter the value of k = ");
		int k=s.nextInt();
		int m=0;
		for(i=0;i<=n-k;i++)
		{
			m=arr[i];
            for(j=1;j<k;j++) 
            {
                if(m<arr[i+j])
                {
                    m=arr[i+j];
                }
            }
            System.out.print(m+" ");
		}
	}
}