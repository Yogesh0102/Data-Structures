import java.util.Scanner;
public class ReverseLinkedList 
{
	static Node head;
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
	 public static void insert(ReverseLinkedList li,int data)
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
	 public void reverse(Node head)
	 {
		 Node temp=head;
		 if(temp.next!=null)
		 {
			 reverse(temp.next);
		 }
		 System.out.print(temp.data+"->");
	 }
	 public static void main(String args[])
	 {
		 ReverseLinkedList li= new ReverseLinkedList();
		 Scanner s=new Scanner(System.in);
		 System.out.print("Enter the number of elements in the LinkedList = ");
		 int n=s.nextInt();
		 int i;
		 System.out.print("Enter elements of the LinkedList = ");
		 if(n==0)
		 {
			 System.out.println("NULL");
		 }
		 else
		 {
			 for(i=0;i<n;i++)
			 {
				 int a=s.nextInt();
				 insert(li,a);
			 }
			 li.reverse(li.head);
			 System.out.println("NULL");
		 }
	 }
}