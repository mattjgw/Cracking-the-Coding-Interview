
// Write code to partition a linked list around a value x, such that all
// nodes less than x come before all nodes greater than or equal to x.
// If x is contained within the list, the values of x only need to be after
// the elements less than x. The partition element x can appear anywhere in 
// the "right partition"; it does not need to appear between the left and 
// right partitions

public class Partition {
	
	public static LinkedListNode partition(LinkedListNode h, int x){
		LinkedListNode partitioned = new LinkedListNode();
		LinkedListNode copy = h;
		while(h != null){
			if(h.data < x){
				partitioned.data = h.data;
				partitioned = partitioned.next;
			}
			h = h.next;
		}
		while(copy != null){
			if(copy.data >= x){
				partitioned.data = copy.data;
				partitioned = partitioned.next;
			}
			copy = copy.next;
		}
		return partitioned;
	}

	public static void main(String[] args) {
		

	}

}
