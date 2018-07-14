
// Implement a MyQueue class which implements a queue using two stacks

// I am using ints instead of a generic T. This does not effect the logic

import java.util.NoSuchElementException;

public class QueueViaStacks {
	
	private MyStack first = new MyStack();
	private MyStack last = new MyStack();
	
	public void add(int item){
		first.push(item);
	}
	
	public int remove(){
		if(last.isEmpty() && first.isEmpty())
			throw new NoSuchElementException();
		if(last.isEmpty()){
			while(!first.isEmpty())
				last.push(first.pop());
		}
		return last.pop();
			
	}
	
	public int peek(){
		if(last.isEmpty() && first.isEmpty())
			throw new NoSuchElementException();
		if(last.isEmpty()){
			while(!first.isEmpty())
				last.push(first.pop());
		}
		return last.peek();
	}
	
	public boolean isEmpty(){
		return first.isEmpty() && last.isEmpty();
	}
	

}
