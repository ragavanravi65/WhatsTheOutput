class Light{
	boolean isOn;
	void turnOn() {
		isOn=true;
	}
	void turnOff() {
		isOn=false;
	}
}
public class LightDemo {

	public static void main(String[] args) {
Light l1=new Light();
Light l2=new Light();
	l1.turnOn();
	System.out.println(l1.isOn);
	l1.turnOff();
	System.out.println(l1.isOn);
	System.out.println(l2.isOn);
	}

}
