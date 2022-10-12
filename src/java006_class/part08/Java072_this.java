package java006_class.part08;

/*
 * [출력결과]
 * 홍길동 보류 3000
 * 
 *===========================================
 *
 *사원중에 부서가 결정되지 않은 경우 부서는 "보류", 급여는 3000으로
 *기본값으로 설정한다.
 */
public class Java072_this {

	public static void main(String[] args) {
		Employees emp = new Employees("홍길동");
		System.out.println(emp.toString());

	}

}
