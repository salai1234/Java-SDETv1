package day8;

interface A {
	int a = 10; // By default variables in interface are static and final
	void m1(); // Abstract method by default public
}

public class InterfaceTest implements A {
	
	public void m1() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		InterfaceTest t = new InterfaceTest();
		t.m1();
		
		A a = new InterfaceTest(); //we can create object for interface, but cannot be instantiated
		a.m1();
	}

}
