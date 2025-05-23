package java013_api;

//  1. 기본자료형을 클래스로 정의해 놓은 것을 Wrapper라 한다.
//    char		-> Character
//    byte		-> Byte
//    short		-> Short
//    int		-> Integer
//    long		-> Long
//    float		-> Float
//    double	-> Double
//    boolean	-> Boolean
//  
//  2. 메모리에 저장된 값을 다른 자료형으로 변환해주는 메소드를 제공하기 위해서
//     Wrapper클래스를 제공한다.
//  
//  3. auto boxing 과 auto unboxing은 jdk5.0에서 추가된 기능이다.
//     auto boxing => 스택 -> 힙 영역에 복사
//     auto unboxing => 힙 -> 스택 영역에 복사

public class Java150_Wrapper {

	public static void main(String[] args) {
		String data = "123";
		// String -> 숫자(int, double, long, float...)
		Integer it = new Integer(data); //java9 deprecated
		int num = it.intValue();
		System.out.println(num);
		
		int num2 = Integer.parseInt(data);
		System.out.println(num2);
		
		double num3 = Double.parseDouble(data);
		System.out.println(num3);
		
		long num4 = Long.parseLong(data);
		System.out.println(num4);
		////////////////////////////////////////
		//String -> 숫자(Integer, Double, Long, Float...)
		Integer ie = Integer.valueOf(data);
		System.out.println(ie);
		
		Double de = Double.valueOf(data);
		System.out.println(de);
		
		Long lg = Long.valueOf(data);
		System.out.println(lg);
		
		////////////////////////////////////////
		//auto boxing, auto unboxing
		Integer ik = new Integer(data);
		int ac = ik.intValue();		
		int ad = ik;  //auto unboxing(stack <- heap)
		double dk = ik;
		System.out.printf("%d %d %,1f\n", ac, ad, dk);
		
		double dc = ik.doubleValue();
		double dd = ik;//auto unboxing(stack <- heap)
		System.out.printf("%.1f  %.1f\n", dc, dd);
		
		int k = 10;
		Integer ii = new Integer(k);
		Integer ia = Integer.valueOf(k);
		Integer ir = k; //auto boxing(heap <- stack)
		
		////////////////////////
		//Boolean
		Boolean ba = new Boolean("true");
		boolean bn = ba.booleanValue();
		System.out.println(bn);
		
		boolean bp = Boolean.parseBoolean("true");
		System.out.println(bp);
		
		boolean ew = true;
		Boolean bk = Boolean.valueOf(ew);
		System.out.println(bk);
		Boolean  bo = ew;
		System.out.println(bo);
		
		String  sw = Boolean.toString(bp);
		System.out.println(sw);
		
	}// end main()

}// end class















