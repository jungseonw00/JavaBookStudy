package p211115;

public class p18 {

	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("프로그램의 사용법");
			System.out.println("Java mainStringArrayArgument num1 num2");
			System.exit(0);
		}
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			
			int result = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + result);
			
		}
	}
