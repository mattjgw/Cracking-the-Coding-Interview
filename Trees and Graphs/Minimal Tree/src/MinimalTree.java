
// Given a sorted (increasing order) array with unique integer elements, write an
// algorithm to create a binary search tree with minimal height

public class MinimalTree {
	
	public static Node minimalTree(int array[]){
		return minimalTree(array, 0, array.length -1);
	}
	
	public static Node minimalTree(int array[], int start, int finish){
		if(finish == start){
			Node root = new Node();
			root.value = array[start];
			return root;
		}
		
		int mid = (finish + start)/2;
		Node root = new Node();
		root.value = array[mid];
		root.leftChild = minimalTree(array, start, mid - 1);
		root.rightChild = minimalTree(array, mid + 1, finish);
		return root;
	}
	
	public static void inOrderTraversal(Node node){
		if(node != null){
			inOrderTraversal(node.leftChild);
			System.out.println(node.value);
			inOrderTraversal(node.rightChild);
		}
	}

	public static void main(String[] args) {
		int array[] = {1, 2, 3, 4, 5, 6, 7};
		Node root = minimalTree(array);
		inOrderTraversal(root);

	}

}
