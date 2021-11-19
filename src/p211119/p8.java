package p211119;

public class p8 {

	public static void main(String[] args) {
		String[] oldStrArray = {"java", "array","copy"};
		String[] newStrArray = new String[5];
		
		//oldStrArray 인덱스 0번, newStrArray 인덱스 0번부터 시작한다. 복사 길이는 oldStrArray의 length만큼.
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(int i=0; i<newStrArray.length; i++) {
			System.out.println(newStrArray[i] + ", ");
		}
	}

}
