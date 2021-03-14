
public class Employee {
	private double salary=15000.00;
	public double getSalary(int salary) {
		return salary;
	}
	public static void main(String[] args) {

		Employee emp=new Employee();
		double result=emp.getSalary(23000);
		System.out.println(result);
	}

}
