package p211115;

public class p2 {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("-----------------------1");
		x++; // x는 11
		++x; // x는 12
		System.out.println("x=" + x); //x는 12
		
		System.out.println("-----------------------2");
		y--; //y는 9
		--y; //y는 8
		System.out.println("y=" + y); //y는 8
		
		System.out.println("-----------------------3");
		z = x++; 
		System.out.println("z=" + z); //z는 12 (다른 연산자를 먼저 처리한 후 계산)
		System.out.println("x=" + x); //x는 13
		
		System.out.println("-----------------------4");
		z = ++x; //z는 14
		System.out.println("z=" + z); //14
		System.out.println("x=" + x); //14

		System.out.println("-----------------------5");
		z = ++x + y++; //23
		System.out.println("z=" + z); // 23
		System.out.println("x=" + x); // 15
		System.out.println("y=" + y); // 9
	}
}
