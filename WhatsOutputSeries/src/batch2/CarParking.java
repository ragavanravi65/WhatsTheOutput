package batch2;

interface Parking{
	static void park() {
		System.out.println("from Parking interface");
	}
}
public class CarParking {

	static void park() {
		System.out.println("from carparking interface");
	}
	public static void main(String[] args) {

		Parking.park();
		park();
	}

}
