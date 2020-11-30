package day7;

final class Bike { //when a class is made final, we cannot extend the class
	final void run() {
		System.out.println("Running.....");
	}
}

/*class Honda extends Bike {
	/*void run() {
		System.out.println("Started......");
	}
}*/
public class FinalMethodDemo {

	public static void main(String[] args) {
		Bike b = new Bike();
		b.run();
		
	}

}
