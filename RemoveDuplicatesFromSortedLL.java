import java.util.Scanner;
import java.util.Arrays;
public class RemoveDuplicatesFromSortedLL
{
	Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	public static void insert(RemoveDuplicatesFromSortedLL li,int data)
	{
		Node newNode=new Node(data);
		newNode.next=null;
		if(li.head==null)
		{
			li.head=newNode;
		}
		else
		{
			Node last=li.head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=newNode;
		}
	}
	public static void display(Node head)
	{
		Node temp=head;
		while(temp.next!=null)
		{
			if(temp.data!=temp.next.data)
			{
				System.out.print(temp.data+"->");
			}
			temp=temp.next;
		}
		System.out.print(temp.data);
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		RemoveDuplicatesFromSortedLL li=new RemoveDuplicatesFromSortedLL();
		System.out.print("Enter the number of elements of array = ");
		int n=s.nextInt();
		int a[]=new int[n];
		int i;
		System.out.print("Enter the elements of array = ");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		for(i=0;i<n;i++)
		{
			insert(li,a[i]);
		}
		System.out.print("Linked List after removing duplicate elements = ");
		display(li.head);
	}
}