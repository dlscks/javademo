package ncs.test02;

import java.lang.reflect.Array;

public class Arraytest {

	public static void main(String[] args) {
		String str = "1.22, 4.12, 5.93, 8.71, 9.34";
		double data[] = new double[5];
		double sum = 0;
		
		String[] st = str.split(",");
		for(String number : st ) {
			sum = sum + Double.parseDouble(number);
		}
			double avg = sum / st.length;
		
			System.out.printf("합계:%.3f\n",sum);
			System.out.printf("평균:%.3f",avg);
//			System.out.printf("평균:%.3f",sum/5);
	
			
			
			
			
			
			
		

	}

}
