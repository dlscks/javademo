package java013_api;

//Ctrl + Shift + O
import java.util.StringTokenizer;


public class Java132_StringTokenizer {

	public static void main(String[] args) {
		//StringTokenizer("문자열", "구분자")
		//문자열의 구분자가 공백일때는 2번째 인자값은 생략 할 수 있다.
		//StringTokenizer st = new String("java,jsp", ",");
		
		StringTokenizer st = new StringTokenizer("java jsp"); // 문자열을 토큰으로 나눠준다.
//		System.out.println(st.countTokens()); //2
//		System.out.println(st.nextToken()); //java
//		System.out.println(st.countTokens()); //1
//		System.out.println(st.nextToken()); //jsp
//		System.out.println(st.countTokens()); //0
//		System.out.println(st.nextToken()); //Exception in thread "main" java.util.NoSuchElementException
		
	// java만 가져옴
//		for(int i = 0; i<st.countTokens();i++) {
//			System.out.println(st.nextToken());
//		}
		
//		int count = st.countTokens();
//		for(int i = 0; i<count;i++) {
//			System.out.println(st.nextToken());
//		}
		
		//메모리에 저장된 토큰이 있으면 true, 없으면 false을 리턴한다.
		while(st.hasMoreTokens()) { //리턴값이 거의 논리값
			System.out.println(st.nextToken());
		}
	}

}
