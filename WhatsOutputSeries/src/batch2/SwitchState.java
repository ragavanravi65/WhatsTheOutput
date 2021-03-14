package batch2;

public class SwitchState {

	public static void main(String[] args) {
		String c=new String("A");
		switch(c) {
		case 60:
			System.out.println("one");
			break;
		case "A":
			System.out.println("two");
		case 3:
			System.out.println("three");
			break;
		}
	}

}
