package java016_stream;
//파일에 저장된 값을 갖고옴

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Java167_stream {

	public static void main(String[] args) {
		File file = new File("sample.txt");

		FileReader fr = null;
		int data;

		try {
			fr = new FileReader(file);
//			for(long i = 0; i<file.length();i++)
//				System.out.print((char)fr.read()); //파일에 있는 값 다 불러옴
			// System.out.println(fr.read()); //j의값 유니코드값 106만 가져옴

			// read(): 파일의 끝일때 -1을 리턴한다.
			while ((data = fr.read()) != -1) {
				System.out.print((char) data);
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}

}
