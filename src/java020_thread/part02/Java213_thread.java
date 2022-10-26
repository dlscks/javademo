package java020_thread.part02;

public class Java213_thread {

	public static void main(String[] args) {
		UserImp um = new UserImp();
		Thread th = new Thread(um);
		th.start();

		for(int i = 0; i<=5; i++) {
			System.out.printf("%s i=%d\n",Thread.currentThread().getName(),i);
	}
	}
}
