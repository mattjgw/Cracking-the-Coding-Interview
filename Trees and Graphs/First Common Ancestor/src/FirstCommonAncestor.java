
// Design an algorithm and write code to find the first common ancestor of two
// nodes in a binary tree. Avoid storing additional nodes in a data structure.
// NOTE: This is not necessarily a binary search tree

public class FirstCommonAncestor {
	
	public static BinaryTreeNode firstCommonAncestor(BinaryTreeNode root, BinaryTreeNode p, BinaryTreeNode q){
		if(!covers(root, p) || !covers(root, q))
			return null;
		return firstCommonAncestorHelper(root, p, q);
	}
	
	

	public static BinaryTreeNode firstCommonAncestorHelper(BinaryTreeNode root, BinaryTreeNode p, BinaryTreeNode q) {
		if(root == null || root == p || root == q)
			return root;
		boolean pIsOnLeft = covers(root.leftChild, p);
		boolean qIsOnRight = covers(root.rightChild, q);
		if(pIsOnLeft != qIsOnRight)
			return root;
		BinaryTreeNode childSide = pIsOnLeft ? root.leftChild : root.rightChild;
		return firstCommonAncestor(childSide, p, q);
	}



	public static boolean covers(BinaryTreeNode root, BinaryTreeNode p) {
		if(root == null)
			return false;
		if(root == p)
			return true;
		return covers(root.leftChild, p) || covers(root.rightChild, p);
	}

	public static void main(String[] args) {
		

	}

}
