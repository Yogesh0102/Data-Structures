public class HeightOfBinaryTree
{
	static class Node
	{
		int key;
		Node left;
		Node right;
		Node(int data)
		{
			key=data;
			left=right=null;
		}
	}
	static Node root;
	HeightOfBinaryTree()
	{
		root=null;
	}
	HeightOfBinaryTree(int data)
	{
		root=new Node(data);
	}
	public static int height(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		else
		{
			int l=height(root.left);
			int r=height(root.right);
			if(l>r)
			{
				return (l+1);
			}
			else
			{
				return (r+1);
			}
		}
	}
	public static void main(String args[])
	{
		HeightOfBinaryTree tree=new HeightOfBinaryTree();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		System.out.print("Height of Binary Tree is = "+height(root));
		
	}
}