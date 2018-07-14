
// An animal shelter, which holds only dogs and cats, operates on a strickly "first in, first
// out" basis. People must adopt either the "oldest" (based on arrival time) of all animals at
// the shelter, or they can select where they would prefer a dog or a cat (and will receive the
// oldest animal of that type). They cannot select which specified animal they would like. Create
// the data structures to maintain this system and implement operations such as enqueue, dequeueAny,
// dequeueDog, and dequeueCat. You may use the built-in LinkedList data structure.

// All items in this queue will be strings for simplicity sake

import java.util.LinkedList;

public class AnimalShelter {
	
	public class Animal{
		private int order;
		public String name;
		
		public Animal(String n){
			name = n;
		}
		
		public void setOrder(int o){
			order = o;
		}
		
		public int getOrder(){
			return order;
		}
	}
	
	public class Dog extends Animal{
		public Dog(String n) {
			super(n);
		}
	}
	
	public class Cat extends Animal{
		public Cat(String n) {
			super(n);
		}
	}

	private LinkedList<Animal> dogs = new LinkedList<Animal>();
	private LinkedList<Animal> cats = new LinkedList<Animal>();
	private int count = 0;
	
	public void enqueue(Animal a){
		a.setOrder(count);
		count++;
		if(a instanceof Cat)
			cats.add(a);
		if(a instanceof Dog)
			dogs.add(a);
	}
	
	public Animal dequeueAny(){
		if(dogs.getFirst().getOrder() < cats.getFirst().getOrder()){
			Animal first = dogs.getFirst();
			dogs.removeFirst();
			return first;
		}
		
		Animal first = cats.getFirst();
		cats.removeFirst();
		return first;
	}
	
	public Animal dequeueDog(){
		Animal first = dogs.getFirst();
		dogs.removeFirst();
		return first; 
	}
	
	public Animal dequeueCat(){
		Animal first = cats.getFirst();
		cats.removeFirst();
		return first;
	}

}
