
// How would you design a stack which, in addition to push and pop, has a function
// min which returns the minimum element? Push, pop, and min should all be O(1) time.

// Add a function to the Stack class which uses another stack to store the min value
// This would also require a modification to the push and pop method

import java.util.EmptyStackException;

public class StackMin<T> extends MyStack{
	
	MyStack min = new MyStack();

	public void push(T item){
		super.push(item);
		
		// New logic
		if(top == null)
			min.push(super.peek());
		if(min.peek() <= item)
			min.push(super.peek());
		
	}
	
	public T pop() {
		if (top == null) throw new EmptyStackException();
		T item = top.getData();
		top = top.next;
		
		// New logic
		if(min.peek() == item)
			min.pop();
		
		return item;
		
		
	}
	
	public T min(){
		if (top == null) throw new EmptyStackException();
		return min.peek();
	}

}
