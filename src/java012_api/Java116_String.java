package java012_api;

public class Java116_String {

	public static void main(String[] args) {
		// 값이 생성 되어있으면 생성되어있는 값을 가르킴
		String sn = "java";
		String sg = "java";
		
		// 메모리를 새로 생성함 주소 값이 다름
		String st = new String("java");
		String ss = new String("java");

		//주소비교
		System.out.printf("sn==sg:%b\n",sn==sg); //true
		System.out.printf("st==ss:%b\n",st==ss); //false
		
		//메모리에 저장된 문자열을 비교
		System.out.printf("sn.equals(sg):%b\n", sn.equals(sg)); //sn.equals(sg):true
		System.out.printf("sn.equals(ss):%b\n", sn.equals(ss)); //sn.equals(ss):true
//	    st.equalsIgnoreCase(st) : 대소문자 비교 안함
//		st.equals(st) : 대소문자 구분함
		
		//메모리에 저장된 문자열 리턴
		System.out.println(sn.toString());
		System.out.println(sn);
	}

}
