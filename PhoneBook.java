package ds;
import java.util.*;
public class PhoneBook 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		HashMap<String,Integer> hm=new HashMap<>();
		System.out.print("Enter the number of contacts = ");
		int n=s.nextInt();
		int i;
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the contact details = ");
			String name=s.next();
			int pn=s.nextInt();
			hm.put(name,pn);
		}
		int q=s.nextInt();
		for(int j=0;j<q;j++)
		{
			System.out.print("Enter the query = ");
			String query=s.next();
			if(hm.get(query)!=null)
			{
				System.out.println(query+"="+hm.get(query));
			}
			else
			{
				System.out.println("Not Found");
			}
		}
	}
}