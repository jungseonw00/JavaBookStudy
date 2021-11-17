package p211115;

public class p3 {
	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		String strVar3 = new String("신민철"); //new 연산자로 새로운 객체 생성
		
		System.out.println(strVar1 == strVar2); //true
		System.out.println(strVar1 == strVar3); //false
		System.out.println();
		System.out.println(strVar1.equals(strVar2)); //문자열 비교
		System.out.println(strVar1.equals(strVar3)); //문자열 비교
	}
}
