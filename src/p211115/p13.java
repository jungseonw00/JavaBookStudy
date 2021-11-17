package p211115;

public class p13 {

	public static void main(String[] args) {
		while(true) {
			int num = (int)(Math.random()*6) + 1;
			System.out.println(num);
			if(num == 6) { //6이 나오는 순간 반복문 break
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
