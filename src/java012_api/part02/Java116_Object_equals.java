package java012_api.part02;

//Object에서 제공된 equals()메소드 객체만 비교가 가능하다.
//Object에서 제공된 equals()메소드 메모리 주소를 비교한다.

public class Java116_Object_equals {

	public static void main(String[] args) {
		
		int k= 3;
        int p=3;
        System.out.println(k==p); //값을 비교
        
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		System.out.println(v1.toString());
		System.out.println(v2.toString());
		
		//메모리 주소
		System.out.println(v1==v2);  //false
		System.out.println(v1.equals(v2));  //false
		
		System.out.println("======================");
        Member m1 = new Member(10);
        Member m2 = new Member(10);
        //java012_api.part02.Member@4517d9a3
        System.out.println(m1);
        //java012_api.part02.Member@372f7a8d
        System.out.println(m2);
        System.out.println(m1==m2); //false
        System.out.println(m1.equals(m2)); //true
        
        Member m3 = new Member(20);
        System.out.println(m1==m3); //false
        System.out.println(m1.equals(m3)); //true
        System.out.println("========================================");
        String s1 = new String("java");
        String s2 = new String("java");
        
        //toString() : 메모리에 저장된 문자열 리턴하도록 오버라이딩 해줌
        System.out.println(s1);  //java
        System.out.println(s2.toString()); //java
        
        
        //메모리 주소
        System.out.println(s1==s2); //false
        // 메모리에 저장된 문자열 비교해서 리턴하도록 오버라이딩 해줌
        System.out.println(s1.equals(s2)); //true
        
        String s3 = new String("jsp"); 
        System.out.println(s1==s3); //false
        System.out.println(s1.equals(s3));  //false
        
	}//end main()

}//end class
