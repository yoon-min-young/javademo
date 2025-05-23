package java006_class.part06;



//  생성자(constructor)
//  1. 객체 멤버변수에 초기값 할당
//  2. 생성자명은 클래스명하고 같다.
//  3. 생성자는 클래스에서 1개 이상 존재한다.
//  4. 클래스에 정의된 생성자가 없으면 JVM에서 기본 생성자를 제공한다.
//    [기본 생성자]
//    - 클래스의 접근제어자하고 같고 파라미티가 없는 구조이다.
//      public HandPhone( ){}
//    - 클래스에 정의된 생성자가 존재하면 기본 생성자는 JVM에서 제공하지 않는다.
// 

//Java에서는 오버로딩을 지원하므로 이름을 같은 여러개의 생성자를 정의할 수 있다.
public class HandPhone {
	String name;
	String number;

	public HandPhone() {

	}
	

	public HandPhone(String a, String n) {
		name = a;
		number = n;
	}

	void display() {
		System.out.printf("%s %s\n", name, number);
	}

} // end class
