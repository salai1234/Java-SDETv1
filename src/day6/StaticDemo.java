package day6;

public class StaticDemo {
	
	static int a=10; // Static variable
	int b=20; // Non-static variable
	
	static void  m1() {
		System.out.println("This is m1 method - inside Static Mehtod");
		StaticDemo sd = new StaticDemo(); //Accessing non-static variable inside static method
		System.out.println(sd.b);
	}
	
	void m2() {
		System.out.println("This is m2 method - inside Non-Static Method");
	}

	void m3() {
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	public static void main(String[] args) {
		
		System.out.println(a);
		m1();
		
		StaticDemo sd = new StaticDemo();
		System.out.println(sd.b);
		sd.m2();
		sd.m3();
	}

}
