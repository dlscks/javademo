package java004_array;
/*
 * data 배열에서 대문자의 갯수를 출력하는 프로그램 구현
 * 
 * 
 */
public class Java042_array {

	public static void main(String[] args) {
		
		char[] data = new char[] { 'a', 'b', 'F', 'R', 'a'};
		int cnt = 0;//대문자 갯수를 저장하기 위한 변수
		
		for(int i = 0; i< data.length; i++) {
			if(data[i]>='A' && data[i]<='Z') {
				cnt++;
			}
		}
		
//		System.out.println("대문자 갯수:"+cnt);
//		System.out.println("대문자 갯수: %d\n", cnt);

	}

}
