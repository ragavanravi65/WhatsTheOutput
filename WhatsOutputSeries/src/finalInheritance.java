class A{
	 final public int calculate(int a,int b) {
		return 1;
	}
}
class B extends A{
	public int calculate(int a,int b) {
		return 2;
}
}
public class finalInheritance {

	public static void main(String[] args) {
		B obj=new B();
		
		System.out.println("b is " + obj.calculate(0,1));
	}

	//Solution:Exception in thread "main" java.lang.VerifyError: class B overrides final method calculate.
}


