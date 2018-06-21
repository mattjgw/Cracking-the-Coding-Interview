
// Implement a function to check if a linked list is a palindrome

public class Palindrome {
	
	public static boolean palindrome(LinkedListNode h){
		LinkedListNode reversed = reverse(h);
		while (h != null){
			if(h.data != reversed.data)
				return false;
			h = h.next;
			reversed = reversed.next;
		}
		return true;
	}
	
	public static LinkedListNode reverse(LinkedListNode h){
		LinkedListNode head = null;
		while(h != null){
			LinkedListNode n = new LinkedListNode(h.data);
			n.next = head;
			head = n;
			h = h.next;
		}
		return head;
	}

	public static void main(String[] args) {
		

	}

}
