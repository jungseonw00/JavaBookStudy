package p211119;

import java.util.Calendar;

public class p13 {

	public static void main(String[] args) {
		Week today = Week.SUNDAY; // 데이터 타입이 Week일 경우 Week의 데이터만 선언할 수 있다.
		System.out.println(today == Week.SUNDAY); // 동일한 힙 영역의 Week 객체를 참조한다.
		
		Week week1 = Week.SATURDAY;
		Week week2 = Week.SATURDAY;
		System.out.println(week1 == week2); // true
		
		Calendar now = Calendar.getInstance();
		int year 	 = now.get(Calendar.YEAR);
		int month 	 = now.get(Calendar.MONTH);
		int day 	 = now.get(Calendar.DAY_OF_MONTH);
		int week 	 = now.get(Calendar.DAY_OF_WEEK);
		int hour 	 = now.get(Calendar.HOUR);
		int minute 	 = now.get(Calendar.MINUTE);
		int second 	 = now.get(Calendar.SECOND);
		
		System.out.println(year);
		
	}

}
