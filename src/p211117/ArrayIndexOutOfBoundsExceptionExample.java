package p211117;

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		if(args.length == 3) {
			String data1 = args[0];
			String data2 = args[1];
			
			System.out.println("args[0]" + data1);
			System.out.println("args[1]" + data2);		
		} else {
			System.out.println("[실행방법]");
			System.out.println("java ArrayIndexOutOfBoundsExceptionExample");
			System.out.println("값1  값2");
		}
	}

}
