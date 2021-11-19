package p211119;

public class p3 {

	public static void main(String[] args) {
		String[] names = {"신용권", "홍길동", "감자바"};
		names[1] = "홍삼원"; // 값을 바꿀 수 있다.
		System.out.println("names[0] : " + names[0]);
		System.out.println("names[1] : " + names[1]); // 홍길동 --> 홍삼원
		System.out.println("names[2] : " + names[2]);
		
		int[]scores = {83, 90, 87};
		scores[0] = 90;
		System.out.println("scores[0] : " + scores[0]); // 83 --> 90
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		double avg = (double) sum / 3;
		System.out.println("평균 : " + avg);
	}

}
