package p211116;

public class test{
	public static void main(String[] args) {
		
		Tire1 t1 = new HankookTire1();
		
		t1.print();
		t1.print2();
	}
}

class Tire1{
	void print() {
		System.out.println("Tire1 class : tire1");
	}
	void print2() {
		System.out.println("Tire1 class : tire2");
	}
}

class HankookTire1 extends Tire1{
}