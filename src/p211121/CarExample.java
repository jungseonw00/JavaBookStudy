package p211121;

public class CarExample extends Car {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		
		myCar.run();
	}
}
