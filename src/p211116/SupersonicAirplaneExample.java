package p211116;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff(); // 이륙합니다
		sa.fly();	  // 일반비행합니다.
		sa.flyMode = SupersonicAirplane.SUPERSONIC; //
		sa.fly(); 	  // 초음속 비행합니다.
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();	  // 일반 비행합니다.
		sa.land();    // 착륙 합니다.
	}

}
