
public class NullpointerTest {
	long a;
	long b;
	public NullpointerTest(long c) {
		b=a+c;
		System.out.println(b);
	}
	public static void main(String[] args) {
		new NullpointerTest(10L);
		//10
		
		int i1=15;
		String b1=i1>20?"green":i1>10?"blue":"violet";
		System.out.println(b1);
	}

}
