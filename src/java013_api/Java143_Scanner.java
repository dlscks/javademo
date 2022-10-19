package java013_api;

import java.util.Scanner;

/*
 * 단입력 : 5
 * 5 X 1 =5
 * 5 X 2 =10
 * 
 * 계속하시겠습니까?(종료:n, 계속: 아무키) n
 * 프로그램 종료
 */
public class Java143_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//프로그램 종료를 정확히 모를 때 
//		while(true) {
//			System.out.print("단 입력:");
//			int dan = sc.nextInt();
//			for(int i = 1; i< 10; i++) {
//				System.out.printf("%d x %d = %2d\n", dan, i , dan * i);
//			}
//			
//			System.out.print("계속하시겠습니까?(종료:n, 계속:아무키): ");
//			String chk = sc.next();
//			if(chk.equals("n")) {
//				
//				break;
//			}
//			}
//		System.out.println("프로그램종료");
		
		while(true) {
		System.out.print("단입력:");
		int dan = sc.nextInt();
		for(int i = 1; i<=9; i++) {
			System.out.println(dan+ " * " +i +" = "+dan*i);
			}
		System.out.print("계속하시겠습니까?(종료:n, 계속:아무키):");
		String chk = sc.next();
		if(chk.equals("n")) {
			break;
		}
		}
			System.out.println("프로그램종료");
		

	}

}
