package p211119;

import java.util.Scanner;

public class p12 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		while(run) {
			System.out.println("--------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------------------");
			System.out.println("선택 >");
			
			int selectNo = Integer.parseInt(scan.nextLine());
			
			// 학생 수 입력
			if(selectNo == 1) {
				studentNum = (Integer.parseInt(scan.nextLine()));
				scores = new int[studentNum];
			//점수 입력
			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = Integer.parseInt(scan.nextLine());
				}
			//점수 리스트
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]: " + scores[i]);
				}
			//분석
			} else if (selectNo == 4) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]: " + scores[i]);
					sum += scores[i];
				}
				System.out.println("총합은 : " + sum);
				double avg = (double) sum / scores.length;
				System.out.println("평균은 : " + avg);
				
			//종료	
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

}
