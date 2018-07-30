
// Write an algorithm to find the "next" node (i.e., in-order successor) of a given node in a
// binary search tree. You may assume that each node has a link to its parent

public class Successor {
	
	public static BinaryTreeNode successor(BinaryTreeNode node){
		if(node.rightChild == null){
			if(node.parent != null){
				if(node.parent.value > node.value)
					return node.parent;
				return null;
			}
				
			return node;
		}
		if(node.rightChild.leftChild != null){
			BinaryTreeNode n = node.rightChild.leftChild;
			while(n.leftChild != null){
				n = n.leftChild;
			}
			return n;
		}	
		return node.rightChild;
	}

	public static void main(String[] args) {
		BinaryTreeNode a = new BinaryTreeNode();
		a.value = 2;
		
		a.leftChild = new BinaryTreeNode();
		a.leftChild.value = 1;
		a.leftChild.parent = a;
		
		a.rightChild = new BinaryTreeNode();
		a.rightChild.value = 4;
		a.rightChild.parent = a;
		
		a.rightChild.rightChild = new BinaryTreeNode();
		a.rightChild.rightChild.value = 5;
		a.rightChild.rightChild.parent = a.rightChild;
		
		a.rightChild.leftChild = new BinaryTreeNode();
		a.rightChild.leftChild.value = 3;
		a.rightChild.leftChild.parent = a.rightChild;
		
		System.out.println(successor(a).value);

	}

}
