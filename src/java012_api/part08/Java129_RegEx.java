package java012_api.part08;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


//  정규화 표현식(Regular Expression)
//  1 정규화 표현식(정규식)이란 텍스트 데이터 중에서 원하는 조건(패턴)과 일치하는 문자열을
//     찾아내기 위해 사용하는 것으로 미리 정의된 기호와 문자를 이용해서
//     작성한 문자열을 말한다.    
 
public class Java129_RegEx {

	public static void main(String[] args) {
		String sn = "12345";
		String st = "aetwef";

		// a-zA-Z_*$가 sn변수에 포함되여 있으면 true 아니면 false을 리턴한다.
		// [ ]은 or을 의미한다.
		// . 임의 문자이고 .*을 임의 문자 여러개(0개 이상)를 의미한다.
		System.out.println(sn.matches(".*[a-zA-Z_*$].*")); // false

		// sn변수에 숫자 0-9가 포함되여 있으면 true 아니면 false를 의미한다.
		System.out.println(sn.matches(".*[0123456789].*")); // true
		System.out.println(sn.matches(".*[0-9].*"));
		System.out.println(sn.matches(".*[\\d].*"));
		System.out.println(sn.matches(".*\\d.*"));

		// sn변수에 숫자 0-9가 포함되여 있지 않으면 true 포함되여 있으면 false를 의미한다.
		System.out.println(sn.matches(".*[^0123456789].*"));
		System.out.println(sn.matches(".*[^0-9].*"));
		System.out.println(sn.matches(".*[\\D].*"));
		System.out.println(sn.matches(".*\\D.*"));

		String sb = "bscba5";
		// sb변수에 저장된 값이 2로 시작되면 true 아니면 false을 리턴한다.
		System.out.println(sb.matches("2.*")); // false

		// sb변수에 저장된 값이 2로 시작되고 5로 끝나면 true 아니면 false을 리턴한다.
		System.out.println(sb.matches("2.*5")); // false

		//sb변수에 저장된 값이 'a' 이거나 'b'로 시작하고 임의문자 5개가 오면 true 아니면 false을 리턴한다.
		System.out.println(sb.matches("[ab].{5}"));
		
		System.out.println("====Pattern=====");
		
		String input = "3a4bsfa";
		System.out.println(input.matches("\\d"));  //false
		
		Pattern pn = Pattern.compile("\\d");
		Matcher mc = pn.matcher(input);
		//java.util.regex.Matcher[pattern=\d region=0,7 lastmatch=]
		System.out.println(mc);
		// mc.find(0) : 현재 작업에서부터(0인덱스부터) 검색을 시작한다. 그래서 처음으로 일치한 3을 리턴한다.
		System.out.printf("%b %s\n", mc.find(), mc.group());
		// mc.find(0) : 0인덱스부터 검색을 시작한다.  그래서 처음으로 일치한 3을 리턴한다.
		System.out.printf("%b %s\n", mc.find(0), mc.group());
		// mc.find(1) : 1인덱스부터 검색을 시작한다. 그래서 처음으로 일치한 4을 리턴한다.
		System.out.printf("%b %s\n", mc.find(1), mc.group());
		// mc.find(2) : 2인덱스부터 검색을 시작한다.  그래서 처음으로 일치한 4을 리턴한다.
		System.out.printf("%b %s\n", mc.find(2), mc.group());
		
		// 3인덱스부터는 패턴에서 지정한 데이터가 없기 때문에 Exception이 발생한다.
		//java.lang.IllegalStateException: No match found
//		System.out.printf("%b %s\n", mc.find(3), mc.group());
	
		System.out.println("====================================");
		String str = "The BEst things in best life are best free";
		boolean res = Pattern.compile("best").matcher(str).find();
		System.out.println(res);
		
		
         
		Pattern ptPattern = Pattern.compile("best", Pattern.CASE_INSENSITIVE);
		Matcher mhMatcher = ptPattern.matcher(str);
		System.out.println(mhMatcher);
		
		int i = 1;
		while (mhMatcher.find()) {
			System.out.printf("%d번째 %d~%d %s\n", i++, mhMatcher.start(), mhMatcher.end(), mhMatcher.group());
		}
		
		
		System.out.println("=========10 20  30=========================");
		str = "The BEst10 things in best life are best30 free";
		ptPattern = Pattern.compile("(best)(10|20|30)", Pattern.CASE_INSENSITIVE);	
		mhMatcher = ptPattern.matcher(str);
		
		i = 1;
		while(mhMatcher.find()) {
			System.out.printf("%d번째 %d~%d %s\n", i++, mhMatcher.start(), mhMatcher.end(), mhMatcher.group());
		}
	}// end main()

}// end class
