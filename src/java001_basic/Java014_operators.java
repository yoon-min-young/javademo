package java001_basic;

/*
 * 조건연산자 : 식의 결과에 리턴해주는 값이 여러개 일때 사용한다.
 * 
 * 조건식 ? 참 : 거짓
 * 
 * int res = 조건식 ? 1 : 0;
 * char res =  조건식 ? 'a' : 'A';
 */

public class Java014_operators {

	public static void main(String[] args) {
		int total = 25;
		int record = 5;

		// total % record == 0 식이 true이면 total / record 계산해서 res변수에 할당한다.
		// total % record == 0 식이 false이면 total / record + 1 계산해서 res변수에 할당한다.
		int res = total % record == 0 ? total / record : total / record + 1;
		System.out.println(res);

		int jumsu = 75;
		// jumsu >= 80 : 상, jumsu < 80 && jumsu >= 60 : 중, jumsu < 60 :하
		char check = jumsu >= 80 ? '상' : jumsu >= 60 ? '중' : '하';
		System.out.println(check);

		check = jumsu >= 60 ? jumsu >= 80 ? '상' : '중' : '하';
		System.out.println(check);
	}// end main()

}// end class
