package p211119;

public class p10 {

	public static void main(String[] args) {
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		//최대값 구하기
		for(int i=0; i<array.length; i++) {
			if(max < array[i]) {
				//순차적으로 배열 값을 넣어서 대소비교를 함.
				max = array[i];
			}
		}
		
		System.out.println("max : " + max);
	}

}
