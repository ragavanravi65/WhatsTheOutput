
class Demo1 {
String name="MiG";
String start() {
	return " main engine start";
}
}
class CivilianAircraft extends Demo1{
	String name=super.name;
	String start() {
		return "Secondary";
	}
}
public class Aircraft{
	
	public static void main(String[] args) {
		new Aircraft().go();
	}

	void go() {
		Demo1 ac=new CivilianAircraft();
		System.out.println(ac.name+" "+ac.start());
	}
}
