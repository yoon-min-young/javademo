package java007_class.part05;

//[출력결과]
//기업은행 42523-52325 100000
//하나은행 52253-22623 153000
//신한은행 16239-95235 256000
//총납입액:509000

public class Java079_class {

// [출력결과]를 참조하여 main()메소드를 구현하세요.
	public static void main(String[] args) {
		CreditCard[] cc = null;
		cc = new CreditCard[3];
		cc[0] = new CreditCard("기업은행", "42523-52325", 100000);
		cc[1] = new CreditCard("하나은행", "52253-22623", 153000);
		cc[2] = new CreditCard("신한은행", "16239-95235", 256000);
		process(cc);

	}// end main()

	public static void process(CreditCard[] cc) {
		int sum = 0;
		for (int i = 0; i < cc.length; i++) {
			sum += cc[i].pay;
			System.out.println(cc[i].toString());
		}

		System.out.println("총납입액:" + sum);
	}// end process()
}// end class