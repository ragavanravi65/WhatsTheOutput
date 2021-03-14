
public class ExceptionHandler {

	public static void main(String[] args) {

		try {
			throw new NullPointerException("Hello");
		}
		catch(ArithmeticException e) {
			System.out.println("B");
		}
		finally {
			System.out.println("final block excuted");
		}
	}
	
//	solution:final block excuted
//Exception in thread "main" java.lang.NullPointerException: Hello
//	at ExceptionHandler.main(ExceptionHandler.java:7)


}
