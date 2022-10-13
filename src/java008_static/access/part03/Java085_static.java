package java008_static.access.part03;

public class Java085_static {
	int x =3;
	static int y = 5;
	public static void main(String[] args) {
		//System.out.printf("x=%d\n", x);
		System.out.printf("y=%d\n", y);
		//process(); //non-static
		display(); //static
		Java085_static js = new Java085_static();
		js.process();
	}//end main
	
	public void process() {
		System.out.println("process");
		display(); //non-static 메소드에서 static메소드 호출가능
	}//end process

	public static void display () {
		System.out.println("display");
	}//end display
}
