package java013_api;

public class Java145_Wrapper {

	public static void main(String[] args) {
		char data = 'a';
		
		System.out.println(Character.toUpperCase(data)); //대문자로 변형
		System.out.println(Character.toLowerCase(data)); //소문자로 변형
		System.out.println(Character.isUpperCase(data)); //대문자?
		System.out.println(Character.isLowerCase(data)); //소문자?
		System.out.println(Character.isAlphabetic(data)); //알파벳?
		System.out.println(Character.isDigit(data)); //숫자?
		System.out.println(Character.toString(data)); //문자열

	}

}
