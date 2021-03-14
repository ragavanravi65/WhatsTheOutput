
public class Fork {

	public static void main(String[] args) {
		System.out.println(args.length);
if(args.length==1 || args[1].equals("test")) {
	System.out.println("Test case");
}
else {
	System.out.println("production"+ args[0]);
}

	}

}
