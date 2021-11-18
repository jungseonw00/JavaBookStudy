package p211118;

public class Calculator {
	static double pi = 3.14159;
	static int plus(int x, int y) {
		int result = x + y;
		System.out.println(x + " + " + y + " = " + result);
		return result;
	}
	
	static int minus(int x, int y) {
		int result = x - y;
		System.out.println(x + " - " + y + " = " + result);
		return result;
	}
}
