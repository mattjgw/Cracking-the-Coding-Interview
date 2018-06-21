
// You have two numbers represented by a linked list, where each node contains a single
// digit. The digits are stored in reverse order, such that the 1's digit is at the head
// of the list. Write a function that adds the two numbers and returns the sum as a linked
// list

public class SumLists {
	
	public static LinkedListNode backwardOrder(LinkedListNode a, LinkedListNode b){
		LinkedListNode sum = new LinkedListNode();
		boolean carry = false;
		while(a!=null){ // Assume a and b are the same length
			sum.data = a.data + b.data;
			if(carry){
				sum.data += 1;
				carry = false;
			}
			if(sum.data >= 10){
				sum.data -= 10;
				carry = true;
			}
			sum = sum.next;
			a = a.next;
			b = b.next;
		}
		return sum;
	}
	
	public static LinkedListNode forwardOrder(LinkedListNode a, LinkedListNode b){
		LinkedListNode sum = new LinkedListNode();
		// Assume a and b and sum are all same length
		while(a!=null){ // Assume a and b are the same length
			sum.data = a.data + b.data;
			if(sum.data >= 10){
				sum.data -= 10;
				sum.prev.data++;
			}
			sum = sum.next;
			a = a.next;
			b = b.next;
		}
		return sum;
	}
	
	public static LinkedListNode backwardOrderNoAssumption(LinkedListNode a, LinkedListNode b, int carry){
		if(a == null && b == null && carry == 0)
			return null;
		int value = carry;
		if(a != null)
			value += a.data;
		if(b != null)
			value += b.data;
		LinkedListNode sum = new LinkedListNode();
		sum.data = value % 10;
		if(a != null || b != null){
			LinkedListNode more = backwardOrderNoAssumption(a == null ? null : a.next,
					b == null ? null : b.next, value >= 10 ? 1 : 0);
			sum.setNext(more);
		}
		return sum;
	}

	public static void main(String[] args) {
		
	}

}
