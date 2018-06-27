
// Given a circular linked list, implement an algorithm that returns the node at the
// beginning of the loop

// DEFINITION: A circular linked list is a corrupt linked list in which a node's next
// pointer points to an earlier node, so as to make a loop in the linked list

// EXAMPLE:
// Input: A -> B -> C -> D -> E -> C (same C as previous)
// Output: C

import java.util.HashSet;

public class LoopDetection {
	
	public static LinkedListNode loopDetection(LinkedListNode a){
		HashSet<LinkedListNode> set = new HashSet<LinkedListNode>();
		while(a != null){
			if(set.contains(a))
				return a;
			set.add(a);
			a = a.next;
		}
		return null;
	}

	public static void main(String[] args) {
		

	}

}
