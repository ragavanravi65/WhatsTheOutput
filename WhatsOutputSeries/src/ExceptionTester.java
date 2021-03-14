
public class ExceptionTester {

	static void myCode() throws MyException{
		try {
			throw new MyException("Test Exception");
		} catch (ArithmeticException e) {
System.out.println("inside error catch");
		}
	}
	public static void main(String[] args) {
		try {
			myCode();
		} catch (Exception e) {
			System.out.println("Inside main exception");
		}

	}

}
