package java009_static.access.part07;

/*
 *다음과 같은 결과가 나오도록 구현하시오
 *
 * 10을 넘겨받은 생성자
 * 10   20 을 넘겨받은 생성자
 * 10   20   30 을 넘겨받은 생성자
 * 10   20   30
 * 합: 60
 */
public class Java098_inheritance {

	public static void main(String[] args) {
		SubClass ss = new SubClass(10, 20, 30);

	}

}
