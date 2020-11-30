package day7;

public class FinalVariableDemo {
	
	final int speed = 50;

	public static void main(String[] args) {
		
		FinalVariableDemo fm = new FinalVariableDemo();
		//fm.speed = 100;
		System.out.println(fm.speed);
	}

}
