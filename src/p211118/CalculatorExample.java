package p211118;

public class CalculatorExample {
	public static void main(String[] args) {
		//객체 마다 가지고 있어야 할 데이터는 인스턴스 필드
		//공용적인 데이터 : 정적필드
		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
	}
}