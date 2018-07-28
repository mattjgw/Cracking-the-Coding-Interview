
// Implement a function to check if a binary tree is a binary search tree

public class ValidateBST {
	
	// Do an in order traversal to see in in sorted order
	
	public static boolean validateBST(BinaryTreeNode root){
		return validateBST(root, Integer.MIN_VALUE, true);
	}
	
	public static boolean validateBST(BinaryTreeNode root, int lastNumber, boolean isLeft){
		if(root == null)
			return true;
		
		if(!validateBST(root.leftChild, lastNumber, true))
			return false;
		
		if(isLeft){
			if(lastNumber > root.value)
				return false;
		}
			
		else{
			if(lastNumber >= root.value)
				return false;
				
		}
			
		lastNumber = root.value;
		if(!validateBST(root.rightChild, lastNumber, false))
			return false;
		
		return true;
	}

	public static void main(String[] args) {
		
		BinaryTreeNode a = new BinaryTreeNode();
		a.value = 2;
		a.leftChild = new BinaryTreeNode();
		a.leftChild.value = 1;
		a.rightChild = new BinaryTreeNode();
		a.rightChild.value = 3;
		a.rightChild.rightChild = new BinaryTreeNode();
		a.rightChild.rightChild.value = 5;
		System.out.println(validateBST(a));
		

	}

}
