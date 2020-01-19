import java.util.*;
public class Anagrams 
{
	public static void check(String str1,String str2)
	{
		int count=0;
		char c1[]=str1.toCharArray();
		char c2[]=str2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(str1.length()==str2.length())
		{
			for(int i=0;i<str1.length();i++)
			{
				if(c1[i]==c2[i])
				{
					count++;
				}
			}
		}
		if(count==str1.length())
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not an Anagram");
		}
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the first string => ");
		String s1=s.next();
		System.out.print("Enter the second string => ");
		String s2=s.next();
		check(s1,s2);
	}
}