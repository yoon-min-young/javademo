package java007_class.part04;


//  [데이터]
//  a001  생명보험  자동차보험   30000
//  a002  생명보험  운전자보험   20000
//  b001  손해보험  화재보험    15000
//  b002  손해보험  해상보험    25000
//  
//  [출력결과]
//  손해보험 총납입액은 40000원 입니다.
 
public class Java078_class {

	public static void main(String[] args) {
		Insurance[] is = new Insurance[4];
		is[0] = new Insurance("a001", "생명보험", "자동차보험", 30000);
		is[1] = new Insurance("a002", "생명보험", "운전자보험", 20000);
		is[2] = new Insurance("b001", "손해보험", "화재보험", 15000);
		is[3] = new Insurance("b002", "손해보험", "해상보험", 25000);

		String search = "손해보험";

		int sum = process(is, search);
		totalPrice(sum, search);
	}// end main()

	// name매개변수 조건에 해당하는 납입액 합계를 구해서 리턴하는 프로그램 구현
	public static int process(Insurance[] is, String name) {
		int sum = 0;
		for(int i =0; i < is.length; i++) {
			if(is[i].name == name) {
				sum = sum + is[i].payment;
			}
		}		
		return sum;
	}// end process()
	
	public static void totalPrice(int sum, String name) {
		System.out.printf("%s 총납입액은 %d원 입니다.\n", name, sum);
	}//end totalPrice()

}// end class









