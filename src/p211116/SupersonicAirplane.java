package p211116;

public class SupersonicAirplane extends Airplane{
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;

	@Override
	public void land() {
		// TODO Auto-generated method stub
		super.land();
	}

	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		}else {
			super.fly();			
		}
	}

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		super.takeOff();
	}
	
	
}
