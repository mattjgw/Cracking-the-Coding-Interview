
public class ReturnKthToLast {
	
	public static LinkedListNode kthToLast(LinkedListNode h, int k){
		LinkedListNode n = h;
		int i = 0;
		while(n != null){
			i++;
			n = n.next;
		}
		int place = i - k;
		for(int j = 0; j < place; j++)
			h = h.next;
		return h;
	}
	
	public static int kthToLastRecursive(LinkedListNode h, int k){
		if(h == null)
			return 0;
		int index = kthToLastRecursive(h.next, k) + 1;
		if(index == k)
			System.out.println(k +"th to last node is "+ h.data);
		return index;
	}

	public static void main(String[] args) {
		

	}

}
