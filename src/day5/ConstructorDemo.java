package day5;

public class ConstructorDemo {
	
	int x;
	int y;
	
	ConstructorDemo(){ //No-arg Constructor
		x=10;
		y=20;
	}
	
	ConstructorDemo(int a, int b){ //Parameterised Constructor
		x=a;
		y=b;
	}
	
	void sum() {
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		
		ConstructorDemo cm1 = new ConstructorDemo();
		cm1.sum();
		
		ConstructorDemo cm2 = new ConstructorDemo(100,200);
		cm2.sum();
		
	}

}
