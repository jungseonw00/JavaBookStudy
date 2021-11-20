package p211119;

//매개 변수의 개수를 모를 경우
public class Computer extends Calculator{

	//메소드 재정의
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
	

}
