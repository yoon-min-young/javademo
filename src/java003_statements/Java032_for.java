package java003_statements;

//  1  2  3  4
//  5  6  7  8
//  9 10 11 12

public class Java032_for {

	public static void main(String[] args) {

//		for (int i = 1; i <= 12; i++) {
//			System.out.printf("%4d", i);
//			if (i % 4 == 0) {
//				System.out.print("\n");
//			}
//		}

		int data = 1;  //
		for (int row = 1; row <= 3; row++) { // 행    
			for (int col = 1; col <= 4; col++) { // 열 
				//System.out.printf("%4d", data);
				//data = data + 1;
				System.out.printf("%4d", data++);
			}
			System.out.print("\n");
		}

	} // end main()

} // end class
