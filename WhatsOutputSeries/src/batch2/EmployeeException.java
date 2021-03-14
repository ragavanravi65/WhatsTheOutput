package batch2;

public class EmployeeException {
	
	static String name="";
	public static void main(String[] args) throws Exception{
		
		try {
			name+="jo";
			throw new Exception();
		} catch (Exception e) {
			name+="hn";
			// TODO: handle exception
		}
		finally {
			name+="s";
			empName();
			name+="on";
		}
		System.out.println(name);
	}
	static void empName() {
		throw new NullPointerException();
	}
}
