
public class TestEmployee {

	public static void main(String[] args) {
		
		Manager m1 = new Manager("Lili", 7000, 2000);
		showSalary(m1);
		
		Executive ex1 = new Executive("Mili", 9000, 3000);
		showSalary(ex1);
	}
	
	public static void showSalary(Employee emp) {
		if(emp instanceof Manager)
			System.out.println("Manager Salary: " + emp.getSalary());
		else
			System.out.println("Executive Salary: " + emp.getSalary());
	}

//	private static void showSalary(Executive ex1) {
//		System.out.println("Executive salary: " + ex1.getSalary());
//	}
//
//	private static void showSalary(Manager m1) {
//		System.out.println("Manager salary: " + m1.getSalary());
//	}

}
