package day5;

public class Student {
	
	int sid;
	String sname;
	char grade;
	
	public Student(int id, String name, char g) {
		sid=id;
		sname=name;
		grade=g;
	}
	
	void getvalues(int id, String name, char g) {
		sid=id;
		sname=name;
		grade=g;
	}
	
	void display() {
		System.out.println(sid+" "+sname+" "+grade);
	}

}