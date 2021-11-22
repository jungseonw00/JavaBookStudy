package p211122;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		try {
			String data1 = "100";
			String data2 = "a100";
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2); //NumberFormatException 발생
			
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);			
		} catch (Exception e) {
			System.out.println("오류가 발생하였습니다.");
		} finally {
			System.out.println("finally 부분입니다.");
		}
	}

}
