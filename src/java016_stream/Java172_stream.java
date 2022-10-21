package java016_stream;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Java172_stream {

	public static void main(String[] args) throws IOException {
//		File file = new File("src/java016_stream/temp");
//		File file = new File("src/java016_stream/a/b");
		File file = new File("src/java016_stream/sample.txt");
		file.deleteOnExit();
		Scanner sc = new Scanner(file);
		System.out.println(sc.nextLine());
		System.out.println(sc.nextLine());
		sc.close();
		
		
//		file.createTempFile("source", "test");
//		if(file.isDirectory()) {
			//file.delete(); //폴더삭제
			//file.deleteOnExit(); // 임시파일을 만들고 종료될떄 파일을 지워줌
//			System.out.println("폴더 삭제");
//		}else {
//			System.out.println("폴더 없음");
//		}

	}

}
