package java004_array;

public class Java046_array {

	public static void main(String[] args) {
		// 3행 2열의 배열
		int[][] num = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		// num.length : num배열의 행의 크기
		// num[row].length : num배열에 해당하는 row 행의 열의 크기
		for (int row = 0; row < num.length; row++) {
			for (int col = 0; col < num[row].length; col++) {
				System.out.printf("num[%d][%d]=%d", row, col, num[row][col]);
				System.out.printf("%c", col != num[row].length - 1 ? '\t' : '\n');
			}
		}

		System.out.println("======================");

		//int row = 0;
		for (int col = 0 , row=0; col < num[row].length; col++, row = 0) {			
			for (; row < num.length; row++) {
				System.out.printf("num[%d][%d]=%d", row, col, num[row][col]);
				System.out.printf("%c", row != num.length - 1 ? '\t' : '\n');
			}
			//row = 0;
		}

	}// end main()

}// end class
