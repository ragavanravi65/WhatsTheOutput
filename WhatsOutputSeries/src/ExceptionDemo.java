
public class ExceptionDemo {

	static class Car implements AutoCloseable {
		public void close() {
			System.out.println("automatic door close");
		}
	}
	public static void main(String[] args) {
		try(Car car=new Car();) {
			System.out.println("inside try block");
			
		} catch (Exception e) {
			System.out.println("catch");
		}
		finally {
			System.out.println("finally");
		}
	}

}
