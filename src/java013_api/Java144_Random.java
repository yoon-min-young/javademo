package java013_api;

import java.util.Arrays;
import java.util.Random;

public class Java144_Random {

	public static void main(String[] args) {
		int[] num = new int[5]; // 1부터 10까지

		Random ran = new  Random();
		for (int i = 0; i < num.length; i++) {
			// 난수 저장
			// 1부터 ~ 10까지
			num[i] = ran.nextInt(10) +1;
			
			//1부터 ~ 45까지
			//num[i] = ran.nextInt(45) + 1;

			for (int j = 0; j < i; j++) {
				// 중복체크
				if (num[j] == num[i]) {
					i--;
					break;
				} // end if

			} // end for j
		} // end for i

		for (int data : num)
			System.out.printf("%4d", data);		
		System.out.println();
		
		//오름차순
		Arrays.sort(num);
		for (int data : num)
			System.out.printf("%4d", data);
		
		
	}// end main()

}//end class
