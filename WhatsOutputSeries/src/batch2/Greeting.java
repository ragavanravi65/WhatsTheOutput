package batch2;

interface Greetings{
	default void greet() {
		System.out.println("within Interface");
	}
}
 class Greeting implements Greetings{
public void greet() {
	System.out.println("within impl");
}
}
 class App{
	public static void main(String[] args) {
		Greetings g=new Greeting();
		g.greet();
	}

}
