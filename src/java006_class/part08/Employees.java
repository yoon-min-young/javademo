package java006_class.part08;

// 사원중에 부서가 결정되지 않은 경우 부서는 "보류", 급여는 3000으로 기본값을 설정한다.
public class Employees {
	String name;
	String dept;
	int salary;

	public Employees() {

	}

	public Employees(int salary) {
		this.salary = salary;
	}

	// 매개변수의 타입과 갯수를 가지고 구분을 하므로 String타입이 1개인 생성자가 2개이면 안된다.
//	public Employees(String dept) {
//		this.dept = dept;
//	}

	public Employees(String name) {
		this("보류", 3000);
		this.name = name;
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
		return String.format("%s %s %d", name, dept, salary);
	}

} // end class
