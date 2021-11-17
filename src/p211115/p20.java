package p211115;

public class p20 {

	public static void main(String[] args) {
		String[] oldstrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldstrArray, 0, newStrArray, 0, oldstrArray.length);
		
		for(int i=0; i<newStrArray.length; i++) {
			System.out.println(newStrArray[i] + ", ");
		}
	}

}
