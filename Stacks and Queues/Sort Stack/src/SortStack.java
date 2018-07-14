
// Write a program to sort a stack such that the smallest items are on the top. You can use
// an additional temporary stack, but you may not copy the elements into any other data
// structure (such as an array). The stack supports the following operations: push, pop, peek,
// and isEmpty

// I will be using ints instead of a generic for simplicity 

public class SortStack {

	private MyStack sortStack = new MyStack();
	private MyStack tempStack = new MyStack();
	
	public void push(int item){
		if(sortStack.isEmpty())
			sortStack.push(item);
		if(sortStack.peek() > item){
			tempStack.push(sortStack.pop());
			push(item);
		}
		while(!tempStack.isEmpty())
			sortStack.push(tempStack.pop());
	}
	
	public int pop(){
		return sortStack.pop();
	}
	
	public int peek(){
		return sortStack.peek();
	}
	
	public boolean isEmpty(){
		return sortStack.isEmpty();
	}

}
