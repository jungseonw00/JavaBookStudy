package p211117;

public class EnumMethodExample {

	public static void main(String[] args) {
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		System.out.println(result1);
		
		//
		Week weekDay = Week.valueOf("SATURDAY");
		if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
			System.out.println("주말 이군요");
		} else {
			System.out.println("평일 이군요");
		}
		Week[] days = Week.values();
		for(Week day : days) { //향상된 for문으로 배열을 출력
			System.out.println(day);
		}
	}
}
