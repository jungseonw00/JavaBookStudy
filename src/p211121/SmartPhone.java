package p211121;

//Phone을 상속받았고 turnOn, turnOff 메소드가 있다.
public class SmartPhone extends Phone{

	//생성자
	public SmartPhone(String owner) {
		super(owner);
	}
	
	//메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}
