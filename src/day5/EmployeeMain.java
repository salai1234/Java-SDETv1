package day5;	

public class EmployeeMain {

	public static void main(String[] args) {
		
			Employee emp1 = new Employee();//Creating object
			emp1.eid = 101;
			emp1.deptno = 10;
			emp1.ename = "David";
			emp1.sal = 25000;
			emp1.job = "Manager";
			
			emp1.display();
			
		
	}

}
