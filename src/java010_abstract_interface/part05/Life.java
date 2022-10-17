package java010_abstract_interface.part05;

//extends ~~~ implments~~~,~~~~
public class Life extends Animal implements SampleA, SampleB {
	public Life() {
		System.out.println("Life");
	}

	@Override
	public void call() {
		System.out.println("call");

	}

	@Override
	public void prn() {
		System.out.println("prn");

	}
}
