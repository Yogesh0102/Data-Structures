import java.util.Scanner;
public class PairsInDoublyLinkedList 
{
	static class Node 
	{
		int data;
		Node next;
		Node prev;
		Node(int d)
		{
			data=d;
			next=null;
			prev=null;
		}
	}
	static Node head;
	static Node tail;
	static int size;
	PairsInDoublyLinkedList()
	{
		head=tail=null;
		size=0;
	}
	public void add(int data) 
	{
		Node newNode=new Node(data);
		if(this.size>=1) 
		{
			this.tail.next = newNode;
			newNode.prev=this.tail;
		}
		if(this.size==0) 
		{
			this.head=newNode;
			this.tail=newNode;
			this.size++;
		} 
		else 
		{
			this.tail=newNode;
			this.size++;
		}
	}
	public void pairs(int s) 
	{
		pairs(this.tail,s);
	}
	static void pairs(Node temp,int s) 
	{
		if(temp==null)
		{
			return;
		}
	    int p=find(temp,temp.prev,s);
	    if(p!=0)
	    {
	    	System.out.print("("+temp.data+", "+p+"), ");
	    }
	    pairs(temp.prev,s);
	}
	public static int find(Node temp,Node last,int s)
	{
		if(last==null)
		{
			return 0;
		}
		if(temp.data+last.data==s)
		{
			return last.data;
		}
		return find(temp,last.prev,s);
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		PairsInDoublyLinkedList li=new PairsInDoublyLinkedList();
		System.out.print("Enter the size of the LinkedList = ");
		int n=sc.nextInt();
		System.out.print("Enter the elements of the LinkedList = ");
		for(int i=0;i<n;i++)
		{
			int a=sc.nextInt();
			li.add(a);
		}
		System.out.print("Enter the value of sum = ");
		int m=sc.nextInt();
		li.pairs(m);
	}
}