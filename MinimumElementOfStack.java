import java.util.*;
public class MinimumElementOfStack 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		Stack<Integer> st=new Stack<>();
		System.out.print("Enter the number of elements in stack = ");
		int n=s.nextInt();
		int i;
		System.out.print("Enter the elements of stack = ");
		for(i=0;i<n;i++)
		{
			st.push(s.nextInt());
		}
		int m=st.pop();
		while(!st.isEmpty())
		{
			int y=st.pop();
			m=Math.min(m,y);
		}
		System.out.print("The minimum element of stack is = "+m);
	}
}