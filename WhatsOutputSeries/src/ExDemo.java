
public class ExDemo {

	public static void main(String[] args) {
try {
	int x=-1,total=55;
	do {
		total=total/x;
		System.out.println(x);
		x++;
	}while(x==0);
} catch (ArithmeticException e) {
	System.out.println("0");
}
	}
}
