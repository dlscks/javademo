package java013_api;

import java.util.Scanner;

public class Java140_Scanner {

	public static void main(String[] args) {
		//콘솔창으로 데이터를 읽어오기 위해서 콘솔창과 연결
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름:");
		
		//next(),nextLine()메소드를 만나면 대기상태가 되며
		//사용자가 데이터를 입력하고 Enter을 하면
		//next(),nextLine() 메소드를 읽는다.
//		String name = sc.next(); //콘솔창에 입력할 수 있게 나옴.한 단어만 인식. 숫자도 문자열로 인식
		String name = sc.nextLine(); //한 라인을 인식함		
		System.out.println(name);// 입력한 값이 나옴.
	}//end main

}//end class
