package Factory;

public class one {
	public void M1() {
		System.out.println("AM an Non static-method");
	}
	
	public void M2() {
		System.out.println("Am an Second non-static menthod");
	}
	
	public static one getA() {
		System.out.println("An object");
		return new one();
	}
}
