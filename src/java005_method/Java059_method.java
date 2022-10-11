package java005_method;

/*[출력결과]
 * 10일때 => 10는(은) 짝수입니다.
 * 9일때 => 9는(은) 홀수입니다.
 */
public class Java059_method {

	public static void main(String[] args) {
		int data = 9;
		// (방법 1) 내가한거
//		boolean result = process(data);
//		if (result){
//			System.out.printf("%d는(은)짝수입니다.\n",data);
//		}else {
//			System.out.printf("%d는(은)홀수입니다.\n",data);
//		}

		// (방법2) 선생
//		if(process(data)) {
//			System.out.printf("%d는(은)짝수입니다.\n",data);
//		}else {
//			System.out.printf("%d는(은)홀수입니다.\n",data);
//		}

		// (방법3) 선생 간단
//		String result = process(data) ? "짝수" : "홀수";
//		System.out.printf("%d는(은) %s입니다.\n", data, result);

		// (방법4) 선생 한줄
		System.out.printf("%d는(은) %s입니다.\n", data, process(data) ? "짝수" : "홀수");

//		int a = 1;
//		System.out.printf("%d %d %d\n", ++a, ++a, ++a); //2 3 4
//		System.out.printf("%d %d %d\n", a++, a++, a++); //1 2 3
	}// end main

	public static boolean process(int data) {
		// data매개변수의 값이 짝수이면 true,
		// 홀수이면 false을 리턴하는 메소드 구현

		// (방법1) 내가한거
//		if (data % 2 == 0)
//			return true;
//		else
//			return false;

		// (방법2) 간단
		return data % 2 == 0 ? true : false;
	}// end process
}// end class
