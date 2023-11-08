package Queue_deque;
class Node{
	int item;
Node left,right;
public Node(int key) {
	item=key;
	left=right=null;
	}
}
public class BinaryTree {
Node root;
BinaryTree(){
	root=null;
}
void inorder(Node node) {
	if(node==null)
		return;
	//traverse left
	inorder(node.left);
	//traverse root
	System.out.print(node.item+"->");
	//traverse right
	inorder(node.right);
	}
void postorder(Node node) {
	if(node==null)
		return;
	//traverse left
	postorder(node.left);
	//traverse right
	postorder(node.right);
	//traverse root
	System.out.print(node.item+"->");
	}
void preorder(Node node) {
	if(node==null)
		return;
	//traverse root
	System.out.print(node.item+"->");
	//traverse left
	preorder(node.left);
	//traverse right
	preorder(node.right);
	}

public static void main(String[] args) {
		// TODO Auto-generated method stub
BinaryTree tree=new BinaryTree();
tree.root=new Node(1);
tree.root.left=new Node(12);
tree.root.right=new Node(9);
tree.root.left.left=new Node(5);
tree.root.left.right=new Node(6);
System.out.println("inorder traversal");
tree.inorder(tree.root);
System.out.println("\nPreorder traversal");
tree.preorder(tree.root);
System.out.println("\nPostorder traversal");
tree.postorder(tree.root);
	}
}