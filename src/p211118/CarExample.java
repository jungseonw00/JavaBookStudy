package p211118;

public class CarExample {
	
	public static void main(String[] args) {
		Car myCar = new Car(); //car 객체 생성
		myCar.setGas(5);	   //가스 5로 설정 
		boolean gasState = myCar.isLeftGas();
		
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) { 
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요");
		}
	}
}
