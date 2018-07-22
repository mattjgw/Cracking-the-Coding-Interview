
// Given a directed graph, design an algorithm to find out whether there is a 
// route between two nodes

import java.util.PriorityQueue;

public class RouteBetweenNodes {
	
	public static boolean routeBetweenNodes(Node root, Node endpoint){
		if(root == endpoint)
			return true;
		root.marked = true;
		PriorityQueue<Node> q = new PriorityQueue<Node>();
		q.add(root);
		
		while(!q.isEmpty()){
			Node r = q.remove();
			for(Node n : r.children){
				if(!n.marked){
					if(n == endpoint)
						return true;
					n.marked = true;
					q.add(n);
				}
				
			}
		}
		return false;
	}

	public static void main(String[] args) {
		

	}

}
