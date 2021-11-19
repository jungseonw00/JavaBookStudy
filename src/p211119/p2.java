package p211119;

public class p2 {

	public static void main(String[] args) {
		String name1 = new String("신용권");
		String name2 = new String("신용권");
		System.out.println(name1 == name2); //new 연산자는 객체 생성 연산자로 새로운 객체를 만들 때 사용한다.
		
		boolean result = name1.equals(name2); //다른 객체인지 상관없이 내부 문자열이 동일한지 확인하기 위해서 사용하는 메소드
		System.out.println(result);
		
	}
}
