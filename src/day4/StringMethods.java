package day4;

public class StringMethods {

	public static void main(String[] args) {
		
		String s = "Welcome To Java";   //All String methods are case sensitive
	
		String s1 = " To Java";
		
		
		System.out.println(s.length());  //Gives length of the string
		System.out.println(s.concat(s1));  //Concatenates two strings
		System.out.println(s.trim());  //Trims before and after spaces in a string
		System.out.println(s.charAt(5));  //Gives a particular character at a given position
		System.out.println(s.contains("o"));  //Checks a set of character(s) in the given string
		System.out.println(s.equals("Welcome"));  //Compares two strings. Case-Sensitive
		System.out.println(s.equalsIgnoreCase("welcome"));  //"". NOT Case-Sensitive
		System.out.println(s.replace('e', 'a'));  //Replaces a char with a given new char
		System.out.println(s.replace("Java", "Selenium"));  //Replaces a word with a given new word
		System.out.println(s.substring(0, 5));  //Gives a substring of a string
											    //Starting Index is from 0
												//Ending Index is from 1
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
	}

}
