package batch2;

public class Vehiclestatic {

	static class Car{
		public void go() {
			System.out.println("car ignition");
		}
	}
	 class ElectricCar extends Car{
		public void go() {
			System.out.println("EC ignition");
		}
	}
	
	 class PetrolCar extends Car{
		public void go() {
			System.out.println("PC ignition");
		}
	}
	public static void main(String[] args) {
//		Car car=new ElectricCar();
//		car.go();
	}

}
