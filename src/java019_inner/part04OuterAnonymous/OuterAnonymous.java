package java019_inner.part04OuterAnonymous;

public class OuterAnonymous {
	private int x;

	InnerAnonymous ta = new InnerAnonymous() {

		void prn() {
			System.out.println("prn");

		}
	};

	public void display() {
		ta.prn();

		new InnerAnonymous() {
			@Override
			void prn() {
				System.out.println("prn2");

			}
		}.prn();
	}
}
