package day2;

public class Operators {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		
		//Arithmetic Operators --> +, -, *, /, %
		System.out.println("Sum of a and b is : "+(a+b));
		System.out.println("Diff of a and b is : "+(b-a));
		System.out.println("Multiply of a and b is : "+(a*b));
		System.out.println("Division of a and b is : "+(a/b));
		System.out.println("Mod of a and b is : "+(a%b));
		
		//Relational Operators (Comparison Operators) --> ==, <, >, <=, >=, !=
		//Always returns boolean value
		System.out.println(a==b);
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a!=b);
		
		//Logical Operators --> &&(AND), ||(OR), !(NOT)
		//Works between two boolean
		boolean x = true;
		boolean y = false;
		
		System.out.println(x&&y);
		System.out.println(x||y);
		System.out.println(!x);
		
		//Increment/Decrement Operators --> ++, --
		a = 10;
		a++;   //a=a+1;
		System.out.println(a);
		a--;  //a=a-1;
		System.out.println(a);
	}

}
