package p211116;

public class ChildExample {
	public static void main(String[] args) {
	
		Parent child = new Child();
		child.method1();
		child.method2();
		//parent.method3();
		child.Parent = 10;
	}
}
