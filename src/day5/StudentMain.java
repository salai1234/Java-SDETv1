package day5;

public class StudentMain {

	public static void main(String[] args) {
		Student stu1 = new Student(100, "Sukumar", 'A');//Assign values by using constructor
		
		//Assign values by using reference variables
		/*stu1.sid = 100;
		stu1.sname = "Sukumar";
		stu1.grade = 'A';*/
		
		//Assign values by using method
		//stu1.getvalues(100, "Sukumar", 'A');
		
		stu1.display();
	}

}
