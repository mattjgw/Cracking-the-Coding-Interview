
// Implement an algorithm to delete a node in the middle (i.e., any node
// but the first and last node, not necessarily the exact middle) of a 
// singly linked list, given only access to that node

public class DeleteMiddleNode {
	
	public static void deleteMiddleNode(LinkedListNode m){
		while(m.next != null){
			m.data = m.next.data;
			m = m.next;
		}
		return;
	}

	public static void main(String[] args) {
		

	}

}
