package java006_class.part08;

public class Employees {
	String name;
	String dept;
	int salary;
	
	public Employees() {
		
	}

	public Employees(String name) {
		this("보류", 3000);//생성자 순서 중요
		this.name = name;
	}
	
	public Employees(int salary) {
		this.salary = salary;
	}
	
	public Employees(String dept, int salary) {
		this.dept = dept;
		this.salary = salary;
	}
	
	public Employees(String name, String dept, int salary) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	public String toString() {
		return String.format("%s %s %d\n", name, dept, salary);
	}
}
