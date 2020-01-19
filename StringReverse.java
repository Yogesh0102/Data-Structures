import java.util.*;
public class StringReverse 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number of test cases => ");
		int t=s.nextInt();
		int i,j;
		for(i=0;i<t;i++)
		{
			System.out.print("Enter the string => ");
			String str=s.next();
			String a[]=str.split("\\.");
			String str1="";
			for(j=a.length-1;j>0;j--)
			{
				str1+=a[j]+".";
			}
			str1+=a[0];
			System.out.println("Reversed string => "+str1);
		}
	}
}