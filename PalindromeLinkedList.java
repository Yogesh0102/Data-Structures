import java.util.Scanner;
public class PalindromeLinkedList 
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
	public static PalindromeLinkedList insert(PalindromeLinkedList li1,int data)
	{
		Node newNode=new Node(data);
		newNode.next=null;
		if(li1.head==null)
		{
			li1.head=newNode;
		}
		else
		{
			Node last=li1.head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=newNode;
		}
		return li1;
	}
	public static PalindromeLinkedList addBeg(PalindromeLinkedList li2,int data)
	{
		Node newNode=new Node(data);
		if(li2.head==null)
		{
			li2.head=newNode;
		}
		else
		{
			newNode.next=li2.head;
			li2.head=newNode;
		}
		return li2;
	}
	public static void checkPalindrome(PalindromeLinkedList li1,PalindromeLinkedList li2)
	{
		Node temp1=li1.head;
		Node temp2=li2.head;
		while(temp1!=null)
		{
			if(temp1.data==temp2.data)
			{
				temp1=temp1.next;
				temp2=temp2.next;
			}
			else
			{
				break;
			}
		}
		if(temp1==temp2)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		PalindromeLinkedList li1=new PalindromeLinkedList();
		PalindromeLinkedList li2=new PalindromeLinkedList();
		System.out.print("Enter the size of LinkedList = ");
		int n=s.nextInt();
		System.out.print("Enter the elements of LinkedList = ");
		for(int i=0;i<n;i++)
		{
			int a=s.nextInt();
			li1.insert(li1,a);
			li2.addBeg(li2,a);
		}
		checkPalindrome(li1,li2);
	}
}
