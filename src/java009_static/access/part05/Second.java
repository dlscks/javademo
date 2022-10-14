package java009_static.access.part05;
//import java.lang.Override;
//import java.lang.System;
//import java.lang.String;

public class Second extends First{
	int b = 20;
	
	
	void display() {
		System.out.println("b=" + b);
	}
	
	void superThisMethod() {
		super.display();
		this.display();
	};

}
