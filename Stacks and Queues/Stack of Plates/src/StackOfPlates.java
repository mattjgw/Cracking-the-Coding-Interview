
// Imagine a (literal) stack of plates. If the stack gets too high, it might topple.
// Therefore, in real life, we would likely start a new stack when the previous stack
// exceeds some threshold. Implement a data structure SetOfStacks that mimics this. 
// SetOfStacks should be composed of several stacks and should create a new stack once
// the previous one exceeds capacity. SetOfStacks.push() and SetOfStacks.pop() should
// behave identically to a single stack (that is, pop() should return the same values
// as it would if there were just a single stack)

// FOLLOW UP

// Implement a function popAt(int index) which performs a pop operation on a specified sub-stack

import java.util.ArrayList;

public class StackOfPlates<T> {

	private int capacity;
	private int currentStackCount = 0;
	private int topStackSize = 0;
	private ArrayList<MyStack> stacks = new ArrayList<MyStack>();
	
	public StackOfPlates(){
		capacity = 1;
	}
	
	public StackOfPlates(int cap){
		capacity = cap;
	}
	
	public void push(T item){
		MyStack last = stacks.get(stacks.size()-1);
		if(currentStackCount < capacity){
			last.push(item);
		}
		else{
			MyStack stack = new MyStack();
			stack.push(item);
			stacks.add(stack);
			currentStackCount++;
		}
		topStackSize++;
	}
	
	public T pop(){
		if(topStackSize == 0){
			stacks.remove(stacks.size() - 1);
			currentStackCount--;
			return stacks.get(currentStackCount).pop();
		}
		topStackSize--;
		return stacks.get(currentStackCount).pop();
	}
	
	public T pop(int index){
		return stacks.get(index).pop();
	}

}
