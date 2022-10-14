package java009_static.access.part01;

public class Father /*extends Object*/{
	int a =3;
	
	public Father() {
		System.out.println("Father");
	}

	void display() {
		System.out.println("a=" + a);
	}
}
