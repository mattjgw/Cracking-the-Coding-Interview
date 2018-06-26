
// Given two (singly) linked lists, determine if the two lists intersect. Return the
// intersecting nodes. Note that the intersection is defined based on reference, not
// value. That is, if the kth node of the first linked list is the exact same node 
// (by reference) as the jth node of the second linked list, then they are intersecting

public class Intersection {
	
	public static LinkedListNode intersection(LinkedListNode k, LinkedListNode j){
		while(k != null){
			LinkedListNode runner = j;
			while(runner != null){
				if(k == runner)
					return k;
				runner = runner.next;
			}
			k = k.next;
			j = j.next;
		}
		
		return null;
	}

	public static void main(String[] args) {
		

	}

}
