import java.util.*;
public class PermutationsOfString
{ 
	public static void permutation(String str,int f,int l) 
    { 
		int i;
		if(str.length()<=0||str.length()>5)
		{
			System.out.println("Invalid Input");
		}
		else
		{
			if (f==l)
			{
				System.out.print(str+" ");
			}
			else 
			{ 
				for(i=f;i<=l;i++) 
				{ 
					str=swap(str,f,i); 
					permutation(str,f+1,l); 
					str=swap(str,f,i); 
				} 
			}
		}
    }
    public static String swap(String str,int i,int j) 
    { 
        char c[]=str.toCharArray();
        char temp; 
        temp=c[i]; 
        c[i]=c[j]; 
        c[j]=temp; 
        return String.valueOf(c); 
    }
    public static void main(String[] args) 
    { 
    	Scanner s=new Scanner(System.in);
    	System.out.print("Enter the number of test cases = ");
    	int t=s.nextInt();
    	int i;
    	for(i=0;i<t;i++)
    	{
    		System.out.print("Enter the string = ");
    		String str=s.next(); 
    		int n=str.length();  
    		permutation(str,0,n-1);
    		System.out.println(" ");
    	}
    }  
} 