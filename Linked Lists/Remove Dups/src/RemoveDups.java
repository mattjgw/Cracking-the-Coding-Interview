
// Write code to remove duplicates from an unsorted linked list.
// FOLLOW UP
// How would you solve this problem if a temporary buffer is not allowed?

import java.util.*;

public class RemoveDups {
	
	public static void removeDups(LinkedListNode n){
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(n.data);
		while(n.next != null){
			if(hs.contains(n.next.data)){
				n.setNext(n.next.next);
			}
			else
				hs.add(n.next.data);
			n = n.next;
		}
		return;
	}
	
	public static void removeDupsNoBuffer(LinkedListNode n){
		while(n.next != null){
			LinkedListNode runner = n.next;
			while(runner != null){
				if(n.data == runner.data)
					runner.prev.setNext(runner.next);
				runner = runner.next;
			}
			n = n.next;
		}
	}

	public static void main(String[] args) {
		

	}

}
