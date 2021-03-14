import java.io.IOException;

public class Tester {

	public static void main(String[] args) {
try {
	throw new IOException();
} catch (IOException|Exception e) {
	System.out.println(e+"caught");
}
		
	}
	
	//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//	The exception IOException is already caught by the alternative Exception


}
