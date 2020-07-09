import java.util.*;

class Node2
{
	Node2 left,right;
	int data;
	Node2(int data)
	{
		this.data=data;
		left=right=null;
	}
}

class Date_070920_Day23_BSTLevelOrderTraversal
{
	static void levelOrder(Node2 root)
	{
		if(root == null)
			return;
		Queue<Node2> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty())
		{
			Node2 node = queue.remove();
			if(node.left!=null)
			{
				queue.add(node.left);
			}
			if(node.right!=null)
			{
				queue.add(node.right);
			}
			System.out.print(node.data+" ");
		}

	}

	public static Node2 insert(Node2 root,int data)
	{
		if(root==null)
		{
			return new Node2(data);
		}
		else
		{
			Node2 cur;
			if(data<=root.data)
			{
				cur=insert(root.left,data);
				root.left=cur;
			}
			else
			{
				cur=insert(root.right,data);
				root.right=cur;
			}
			return root;
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		Node2 root=null;
		while(T-->0)
		{
			int data=sc.nextInt();
			root=insert(root,data);
		}
		levelOrder(root);
	}
}