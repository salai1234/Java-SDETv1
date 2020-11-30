package day7;



public class Animal {
	String color = "White";
	
	void eating() {
		System.out.println("Eating......");
	}
	
	Animal(){
		System.out.println("Animal is created....");
	}
}

class Dog extends Animal {
	String color = "Black";
	
	void displayColor() {
		System.out.println(color);
		System.out.println(super.color);
	}
	
	void eating() {
		System.out.println("Eating bread......");
		super.eating();
	}
	
	Dog (){
		super();
		System.out.println("Dog is created....");
	}
	
}
