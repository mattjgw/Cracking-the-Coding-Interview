import java.util.ArrayList;
import java.util.LinkedList;

// A binary search tree was created by traversing through an array from left to right and
// inserting each element. Given a binary search tree with distinct elements, print all 
// possible arrays that could have led to this tree

public class BSTSequence {
	
	public static ArrayList<LinkedList<Integer>> allSequences(BinaryTreeNode node){
		ArrayList<LinkedList<Integer>> result = new ArrayList<LinkedList<Integer>>();
		
		if(node == null){
			result.add(new LinkedList<Integer>());
			return result;
		}
		
		LinkedList<Integer> prefix = new LinkedList<Integer>();
		prefix.add(node.value);
		
		ArrayList<LinkedList<Integer>> leftSeq = allSequences(node.leftChild);
		ArrayList<LinkedList<Integer>> rightSeq = allSequences(node.rightChild);
		
		for(LinkedList<Integer> left : leftSeq){
			for(LinkedList<Integer> right : rightSeq){
				ArrayList<LinkedList<Integer>> weaved = new ArrayList<LinkedList<Integer>>();
				weaveLists(left, right, weaved, prefix);
				result.addAll(weaved);
			}
		}
		return result;
	}
	
	

	public static void weaveLists(LinkedList<Integer> left, LinkedList<Integer> right,
			ArrayList<LinkedList<Integer>> weaved, LinkedList<Integer> prefix) {
		if(left.size() == 0 || right.size() == 0){
			LinkedList<Integer> result = (LinkedList<Integer>) prefix.clone();
			result.addAll(left);
			result.addAll(right);
			weaved.add(result);
			return;
		}
		
		int headLeft = left.removeFirst();
		prefix.addLast(headLeft);
		weaveLists(left, right, weaved, prefix);
		prefix.removeLast();
		left.addFirst(headLeft);
		
		int headRight = right.removeFirst();
		prefix.addLast(headRight);
		weaveLists(left, right, weaved, prefix);
		prefix.removeLast();
		right.addFirst(headRight);
	}


	public static void main(String[] args) {

	}

}
