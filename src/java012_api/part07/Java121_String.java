package java012_api.part07;

public class Java121_String {

	public static void main(String[] args) {
		String str = new String("KoREa,jsp,java");

		System.out.println("문자열 길이:" + str.length()); // 14
		System.out.println("대문자:" + str.toUpperCase()); // KOREA,JSP,JAVA
		System.out.println("소문자:" + str.toLowerCase()); // korea,jsp,java
		System.out.println("문자:" + str.charAt(0)); // K
		System.out.println("문자:" + str.charAt(5)); // ,
		System.out.println("인덱스:" + str.indexOf('a')); // 4
		System.out.println("인덱스:" + str.indexOf(97)); // 4
		// str.indexof(int ch, int fromIndex)
		System.out.println("인덱스:" + str.indexOf('a', 5)); // 11
		System.out.println("인덱스:" + str.indexOf(97, 5)); // 11

		System.out.println("인덱스:" + str.indexOf("jsp")); // 6
		// 검색 문자열이 없으면 -1을 리턴한다.
		System.out.println("인덱스:" + str.indexOf("jsp", 7)); // -1

		// 5인덱스부터 마지막까지 문자열 리턴
		System.out.println("범위:" + str.substring(5)); // ,jsp,java
		// 2인덱스부터 8미만 인덱스의 문자열 리턴
		System.out.println("범위:" + str.substring(2, 8)); // REa,js

		// 메모리에 저장된 문자열을 ","로 구분해서 문자열 배열로 리턴
		String[] arr = str.split(",");
		for (int i = 0; i < arr.length; i++)
			System.out.printf("arr[%d]=%s\n", i, arr[i]);

		int x = 10;
		int y = 20;		
		System.out.printf("x=%d, y=%d, x+y=%d\n", x, y, x + y);  //x=10, y=20, x+y=30
		
		String s1 = String.valueOf(x);
		String s2 = String.valueOf(y);
		System.out.printf("s1+s2=%s\n", s1+s2);  //1020
		
		char[] data = {'1','2','3','4','5'};
		String s3 = String.valueOf(data);
		System.out.printf("s3=%s\n", s3);  //12345
		
		//valueOf(char[] data, int offset, int count)
		String s4 = String.valueOf(data, 2, 3);
		System.out.printf("s4=%s\n", s4); // 345
		
		// java.lang.StringIndexOutOfBoundsException: offset 2, count 8, length 5
		//String s5 = String.valueOf(data, 2, 8);
		//System.out.printf("s5=%s\n", s5);
	} // end main()

}// end class












