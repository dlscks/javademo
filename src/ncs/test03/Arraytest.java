package ncs.test03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Arraytest {

	public static void main(String[] args) {
		String todayfm = new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis()));

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println();
	}

}
