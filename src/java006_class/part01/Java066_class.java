package java006_class.part01;

//클래스의 두가지 용도
//1) 라이브러리(library)클래스 : 실행할 수 없으며 다른 클래스에서 이용하는 클래스
//2) 실행 클래스 : main( )메소드를 가지고 있는 실행 가능한 클래스

public class Java066_class {

	public static void main(String[] args) {
		// 1) 객체참조변수 선언
		// 2) new로 객체생성(heap영역에 메모리 확보)
		// 3) 생성자를 호출해서 heap에 있는 멤버변수의 초기값을 할당
		// 3-1) 생성자를 통해서 멤버변수에 초기값을 할당하지 않으면 JVM에서 자동으로 멤버변수에 기본값을 할당
		// 4) 객체참조변수를 통해서 heap 영역에 있는 자원(멤버변수)을 호출할 수 있다.
		// 객체참조변수를 통해서 method영역에 있는 자원(메소드)을 호출할 수 있다.

		Person pn; // 객체참조변수 선언
		pn = new Person(); // 객체생성

		// 객체참조변수.멤버변수
		pn.name = "홍길동";
		pn.age = 30;
		pn.gender = '남';

		System.out.printf("%s %d %c\n", pn.name, pn.age, pn.gender);

		// 객체참조변수.메소드()
		pn.develop();
		pn.run();

		Person ps = new Person(); // 객체참조변수 선언 및 생성
		ps.name = "김영희";
		ps.age = 28;
		ps.gender = '여';
		System.out.printf("%s %d %c\n", ps.name, ps.age, ps.gender);
		ps.develop();
		pn.run();

	} // end main()

} // end class
