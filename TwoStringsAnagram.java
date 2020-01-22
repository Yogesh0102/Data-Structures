import java.util.*;
public class TwoStringsAnagram 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the string 1 = ");
		String str1=s.next();
		System.out.print("Enter the string 2 = ");
		String str2=s.next();
		char a1[]=str1.toCharArray();
		char a2[]=str2.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
		if(Arrays.equals(a1,a2))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}