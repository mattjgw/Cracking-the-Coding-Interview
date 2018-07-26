
// Implement a function to check if a binary tree is balanced. For the purposes of
// this question, a balanced tree is defined to be a tree such that the heights of
// the two subtrees of any node never differ by more than one

public class CheckBalanced {
	
	public static boolean checkBalanced(BinaryTreeNode root){
		return checkBalanced(root, 0);
	}
	
	public static boolean checkBalanced(BinaryTreeNode root, int level){
		if(root.leftChild == null && root.rightChild == null)
			return true;
		if(level == 1)
			return false;
		if(root.leftChild != null && root.rightChild == null){
			return checkBalanced(root.leftChild, 1);
		}
		if(root.leftChild == null && root.rightChild != null){
			return checkBalanced(root.rightChild, 1);
		}
		if(root.leftChild != null && root.rightChild != null){
			boolean b = checkBalanced(root.leftChild, 0);
			if(!b) return false;
			return checkBalanced(root.rightChild, 0);
			
		}
		return false;
	}

	public static void main(String[] args) {
		
		BinaryTreeNode r = new BinaryTreeNode();
		r.name = "A";
		r.leftChild = new BinaryTreeNode();
		r.leftChild.name = "B";
		r.rightChild = new BinaryTreeNode();
		r.rightChild.name = "C";
		System.out.println(checkBalanced(r));

	}

}
