package day5;

public class Calculation {
	
	int x=10;
	int y=5;

	/*void sum(){ //case1: No parameters, No return type
		System.out.println(x+y);
	}*/
	
	/*int sum() { //case2: No parameters, return type
		return (x+y);
	}*/
	
	/*void sum(int a, int b) { //case3: Parameters, No return type
		System.out.println(a+b);
	}*/
	
	int sum(int a, int b) { //case4: Parameters, Return type
		return (a+b);
	}
	
	public static void main(String[] args) {
		
		Calculation cal = new Calculation();
		//cal.sum();//case1
		
		/*int result=cal.sum();
		System.out.println(result);//case2
		System.out.println(cal.sum());*/
		
		//cal.sum(100,200); //case3
		
		System.out.println(cal.sum(100, 200)); //case4
	}
	

}
