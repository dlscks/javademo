package java013_api;

public class Java130_StringBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java test");
		
		//4인덱스에 ",jsp"문자열을 삽입
		sb.insert(4, ",jsp");//java,jsp test
		System.out.println(sb);
		
		//4인덱스부터 8인덱스미만 사이의 문자열을 삭제
		sb.delete(4,  8);//java test
		System.out.println(sb);
		
		//마지막에 문자열을 추가
		sb.append(" start");//java test start
		System.out.println(sb);
		
		//문자열을 반대로 변경
		sb.reverse();
		System.out.println(sb);

		//String -> StringBuffer -> String
		String data = "mybatis orm";
		StringBuffer sf = new StringBuffer(data); // String 데이터를 StringBuffer 로 변환
		sf.reverse();
		System.out.println(sf);
		System.out.println(data);
		String re = sf.toString(); //StringBuffer데이터를 String으로 변환
		System.out.println(re);
		
		//char[] -> String -> StringBuffer
		char[] arr = {'k','o','r','e','a'};
		String sp = String.valueOf(arr);
		StringBuffer se = new StringBuffer(sp);
		se.reverse();
		System.out.println(se);
		
		System.out.println(new StringBuffer(String.valueOf(arr)).reverse()); // 한줄로 가능
		
		//StringBuffer -> String -> char[]
		String st = se.toString();
		char[] val = st.toCharArray();
		System.out.println(val);
		
		System.out.println(se.toString().toCharArray());
		
		
		
		
		
	}//end main

}//end class
