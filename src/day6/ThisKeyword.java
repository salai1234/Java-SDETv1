package day6;

public class ThisKeyword {
	
	int a;
	int b;
	
	void getvalues(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	void display() {
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		
		ThisKeyword th = new ThisKeyword();
		th.getvalues(10, 20);
		th.display();
		
	}

}
