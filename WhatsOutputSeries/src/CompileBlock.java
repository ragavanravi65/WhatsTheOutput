
public class CompileBlock {

	public static void main(String[] args) {

		int x;
		x=5;
		{
			int y=6;
			System.out.println(x+ " "+y);
		}
		System.out.println(x+" "+y);
	}

//	Solution:Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//		y cannot be resolved to a variable

}
