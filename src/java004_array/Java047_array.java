package java004_array;

// [데이터]
// 홍길동   90  85 40
// 이영희  100  35 75
// 
// [출력결과]
// 홍길동   90  85 40 215 71.7
// 이영희  100  35 75 210 70.0

public class Java047_array {

	public static void main(String[] args) {
		String[] name = { "홍길동", "이영희" };
		int[][] jumsu = { { 90, 85, 40 }, { 100, 35, 75 } };

		int sum; // local variable
		double avg;
		for (int row = 0; row < jumsu.length; row++) {
			sum = 0;
			System.out.printf("%s\t", name[row]);
			for (int col = 0; col < jumsu[row].length; col++) {
				System.out.printf("%4d", jumsu[row][col]);
				sum = sum + jumsu[row][col];
			}

			avg = sum / (double) jumsu[row].length;
			System.out.printf("%4d%5.1f\n", sum, avg);
		}

	} // end main()

}// end class
