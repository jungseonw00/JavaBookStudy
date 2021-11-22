package p211121;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child(); // 부모에 선언된 필드와 메소드만 사용 가능하다는 제약사항이 따른다.(자동타입변환)
		//Child child = (child) parent; //강제 타입 변환
//		parent.field1 = "data1";
//		parent.method1();
//		parent.method2();
		
	}

}
