package java003_statements;

public class Java037_while {

	public static void main(String[] args) {
		int cnt = 1;

		while (true) {
			System.out.println(cnt++);
			if (cnt == 6) {
				break;
			}
		}

	}// end main()

}// end class
