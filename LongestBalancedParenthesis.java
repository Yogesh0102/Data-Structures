import java.util.*;
public class LongestBalancedParenthesis 
{
	public static void check(String str)
	{
		Stack<Integer> st=new Stack<Integer>();
		st.push(-1);
		int count=0;
		int i;
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='(')
			{
				st.push(i);
			}
			else
			{
				st.pop();
				if(!st.isEmpty())
				{
					count=Math.max(count,i-st.peek());
				}
				else
				{
					st.push(i);
				}
			}
		}
		System.out.println("Count of longest balanced parenthesis is = "+count);
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number of test cases = ");
		int t=s.nextInt();
		int i;
		for(i=0;i<t;i++)
		{
			System.out.print("Enter the string = ");
			String str=s.next();
			check(str);
		}
	}
}