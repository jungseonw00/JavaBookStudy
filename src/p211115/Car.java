package p211115;

public class Car {
	
	String model;
	int speed;
	
	Car(String model){
		this.model = model;
	}
	
	void setspeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i=10; i<=50; i+=10) {
			this.setspeed(i);
			System.out.println(this.model + "가 달립니다.(시속:" + this.speed + "km/h)");
		}
	}
//	int speed;
//	
//	int getspeed() {
//		return speed;
//	}
//	
//	void keyTurnOn() {
//		System.out.println("키를 돌립니다.");
//	}
//	
//	void run() {
//		for(int i=10; i<=50; i+=10) {
//			speed = i;
//			System.out.println("달립니다.(시속:" + speed + "km/h)");
//		}
//	}
	
	
	
	
	
	
	
	
	
	
//	int gas;
//	
//	void setGas(int gas) {
//		this.gas = gas;
//	}
//	
//	boolean isLeftGas() {
//		if(gas==0) {
//			System.out.println("gas가 없습니다.");
//			return false; 
//		} 
//		System.out.println("gas가 있습니다.");
//		return true;
//	}
//	
//	void run() {
//		while(true) {
//			if(gas > 0) {
//				System.out.println("달립니다.(gas잔량:" + gas + ")");
//				gas -= 1;
//			} else {
//				System.out.println("멈춥니다.(gas잔랑:" + gas + ")");
//				return; // 메소드 실행 종료
//			}
//		}
//	}
//	String company = "현대자동차";
//	String model;
//	String color;
//	int maxSpeed;
//	
//	//생성자 1
//	Car(){
//		
//	}
//	
//	//생성자 2
//	Car(String model){
//		this.model = model;
//	}
//	
//	//생성자 3
//	Car(String model, String color){
//		this.model = model;
//		this.color = color;
//	}
//	
//	//생성자 4
//	Car(String model, String color, int maxSpeed){
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = maxSpeed;
//	}
}
