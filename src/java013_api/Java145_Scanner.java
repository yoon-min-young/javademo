package java013_api;

import java.util.Scanner;

// java.util.Scanner : jdk5에서 추가 되었음
public class Java145_Scanner {

	public static void main(String[] args) {
		
		//콘솔창으로 데이터를 읽어오기 위해서 콘솔창과 연결
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름:");
		
		//sc.next(): 콘솔창으로 부터 데이터를 입력받기 위해서 대기상태가 되며
		// 사용자 데이터를 입력하고 Enter을 하면
		//next(),nextLine() 메소드에서 읽는다.
	
		//next()은 공백앞까지만 읽는다.
        // String name = sc.next(); 
		
		//nextLine(): 한 라인을 읽는다.
		 String name = sc.nextLine();
         System.out.println(name);
	}//end main()

}//end class
