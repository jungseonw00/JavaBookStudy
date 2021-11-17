package p211115;

import java.util.Scanner;

public class p12 {

	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print(">");
			inputString = scanner.nextLine(); //키보드로 입력한 문자열을 얻는다.
			System.out.println(inputString);
		} while ( !inputString.equals("q"));
		
		System.out.println();
		System.out.println("프로그램 종료");
	}

}
