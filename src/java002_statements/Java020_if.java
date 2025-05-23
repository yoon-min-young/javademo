package java002_statements;


//  [문제]
//  data변수에 저장된 값이 대문자이면 "대문자입니다.", 소문자이면 "소문자입니다."
//  그외는 "기타입니다."로 출력하는 프로그램을 구현하세요.
//  
//  [출력결과]
//  data='D'  =>  D는 대문자입니다.
//  data='d'  =>  d는 소문자입니다.
//  data='1'  =>  1는 기타입니다.
 
public class Java020_if {

	public static void main(String[] args) {
		char data = '2';
		
		// 'A' >= data <= 'Z'  (수학)
		//  data >= 'A' && data <= 'Z'  (프로그램)  data >= 65 && data <= 90
		
		if (data >= 'A' && data <= 'Z') {
			// 대문자
			System.out.printf("%c는 대문자입니다.\n", data);			
		}else if (data >= 'a' && data <= 'z') {
			 //소문자
			System.out.printf("%c는 소문자입니다.\n", data);	
		}else {
			// 기타
			System.out.printf("%c는 기타입니다.\n", data);
		}
	} // end main()

}// end class










