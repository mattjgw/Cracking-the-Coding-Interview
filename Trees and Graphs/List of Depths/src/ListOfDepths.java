import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

// Given a binary tree, design an algorithm which creates a linked list of all the nodes
// at each depth (e.g. if you have a tree with depth D, you'll have D linked lists)

public class ListOfDepths {
	
	public static ArrayList listOfDepths(BinaryTreeNode root){
		ArrayList<LinkedList<BinaryTreeNode>> lists = new ArrayList<LinkedList<BinaryTreeNode>>();
		LinkedList<BinaryTreeNode> current = new LinkedList<BinaryTreeNode>();
		if(root != null)
			current.add(root);
		while(!current.isEmpty()){
			lists.add(current);
			LinkedList<BinaryTreeNode> next = new LinkedList<BinaryTreeNode>();
			for(BinaryTreeNode n: current){
				if(n.leftChild != null)
					next.add(n.leftChild);
				if(n.rightChild != null)
					next.add(n.rightChild);
			}
			current = next;
		}
		return lists;
	}

	public static void main(String[] args) {
		

	}

}
