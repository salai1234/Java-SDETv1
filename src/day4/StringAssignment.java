package day4;

public class StringAssignment {

	public static void main(String[] args) {

		String s = "This is Sukumar";
		String s1 = " I am fine";
		
		System.out.println(s.equalsIgnoreCase("this is sukumar"));
		System.out.println(s.concat(s1));
		System.out.println(s.length());
		System.out.println(s.substring(0,10));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
	}

}
