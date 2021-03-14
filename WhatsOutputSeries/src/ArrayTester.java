
public class ArrayTester {

	public static void main(String[] args) {

		String[] s1=new String[60];
		String[] s2=new String[80];
		s1=s2;
		System.out.println(s1.length);
		
		Integer n1=new Integer(100);
		Integer n2=new Integer(100);
		Integer n3=127;
		Integer n4=127;
		System.out.println(n1==n2);
		System.out.println(n3==n4);
	}

}
