package java009_inheritance.part01;

//  상속(inheritance)
//  1. 기본 클래스를 재사용해서 새로운 클래스를 정의하는 기능이다.
//  2. 두 클래스를 조상과 자손 관계를 맺어준다. (extends)
//  3. 상속을 해주는 클래스 : 수퍼클래스(Super class), 부모클래스, 기본클래스
//     상속을 받는 클래스 : 서브클래스 , 자식클래스, 유도클래스
//  4. 자식(손)클래스는 조상의 모든 자원을 상속받는다. ( 생성자, static{} 은 제외)
//  5. 자식(손)의 자원은 부모보다 크거가 같아야 한다.
//  6. 상속을 할때 사용되는 키워드 :
//      클래스를 클래스에 상속 : extends(단일상속), 인터페이스에 인터페이스 상속: extends(다중상속)
//         
//   class A{}
//   class B extends A{}
//   
//   => 자식클래스 B extends 부모클래스 A
//   
//   - A는 B에게 상속한다.
//   - B는 A이다. (상속관계의 클래스를 is a 관계라 한다.)
//   
//   class 도형{}
//   class 삼각형 extends 도형{  }
//   삼각형은 도형이다.
 

public class Java093_inheritance {

	public static void main(String[] args) {
		// 포함관계 (has a ~)
		Father father = new Father();

		Child child = new Child();
		System.out.println(child.a);
		// c변수는 private으로 선연되여 있기 때문에 상속이 안된다.
		//System.out.println(child.c);
		
		child.display();		
		
		Sub sub = new Sub();
		System.out.println(sub.a);
		//System.out.println(sub.c);
		sub.display();
		

	}// end main()

}// end class
