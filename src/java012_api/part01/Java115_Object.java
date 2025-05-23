package java012_api.part01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//import java.lang.Object;

//  1.리플렉션(reflection)
//  자바는 클래스와 인터페이스의 메타정보를 Class객체로 관리한다. 
//  여기서 메타정보란 패키지 정보, 타입정보, 멤버(생성자,필드,메소드)정보 등을 말한다.
//  이러한 메타 정보를 프로그램에서 읽고 수정하는 행위를 리플렉션이라고 한다.
//  프로그램에서 Class객체를 얻으려면 다음 3가지 방법 중 하나이다.
//  ① Class clazz = 클래스명.class;                       => 클래스로부터 얻는 방법
//  ② Class clazz = Class.forName("패키지...클래스명"); => 클래스로부터 얻는 방법
//  ③ Class clazz = 객체참조변수.getClass();             => 객체로부터 얻는 방법
//  
//  2.JAVA API(Application Programming Interface)
//  
//  Object
//  1). 클래스 중에서 최상위 클래스이다.
//  2). Object을 제외한 모든 클래스들은 Object을 상속받고 있다.
//  3). java.lang패키지에서 제공하는 클래스이다.
//  4). equals() : 객체의 번지를 비교하고 결과를 리턴
//     hashCode( ) : 객체의 해시코드를 리턴
//     toString( ) : 객체 문자 정보를 리턴

public class Java115_Object {

	public static void main(String[] args) {
		Object obj = new Object();

		// java.lang.Object@36baf30c
		System.out.println(obj); // obj.toString()
		System.out.println(obj.toString());

		// 1. 생성된 객체로 부터 얻는 방법
		Class cobj = new Object().getClass();
		System.out.println(cobj); // class java.lang.Object

		// 2. 클래스 리터널(*.class)로 부터 얻는 방법
		cobj = Object.class;
		System.out.println(cobj); // class java.lang.Object

		// 3. 클래스 이름으로 부터는 얻는 방법
		try {
			cobj = Class.forName("java.lang.Object");
			System.out.println(cobj); // class java.lang.Object
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		////////////////////////////////////////////
		// 패키지 정보 읽기
		System.out.println(cobj.getPackageName()); // java.lang

		// 패키지를 포함한 전체 타입 이름
		System.out.println(cobj.getName()); // java.lang.Object

		// 메소드 정보 가져오기
		//getMethods() : 현재 접근 가능한 메소드 정보만 가져옴
		System.out.println("====getMethods()===");
		Method[] func = cobj.getMethods();
		for (Method md : func) {
			System.out.println(md);
		}
		
		//getDeclaredMethods() : 클래스에 정의된 모든 메소드를 가져옴
		System.out.println("====getDeclaredMethods()===");
		Method[] methodsDec = cobj.getDeclaredMethods();
		for (Method md : methodsDec) {
			System.out.println(md);
		}

//////////////////////////////////////////////
		String ojt = new String();
		System.out.println("생성자 정보 : getDeclaredConstructors()");
		Constructor<?>[] con = ojt.getClass().getDeclaredConstructors();
		for (Constructor<?> data : con)
			System.out.println(data.getName());

		System.out.println("멤버변수 정보 : getFields()");
		Field[] fields = ojt.getClass().getFields();
		for (Field field : fields)
			System.out.println(field);
		
		System.out.println("멤버변수 정보 : getDeclaredFields()");
		Field[] fields2 = ojt.getClass().getDeclaredFields();
		for (Field field : fields2)
			System.out.println(field);

		System.out.println("메소드 정보 : getMethods()");
		Method[] methods = ojt.getClass().getMethods();
		for (Method method : methods)
			System.out.println(method);
		
		System.out.println("메소드 정보 : getDeclaredMethods()");
		Method[] methods2 = ojt.getClass().getDeclaredMethods();
		for (Method method : methods2)
			System.out.println(method);
	} // end main()

}// end class
