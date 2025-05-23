package java012_api.part07;

public class Java115_String {

	public static void main(String[] args) {
		char[] data = { 'j', 'a', 'V', 'A' };
		MyString myString = new MyString(data);
		System.out.println(myString.length());
		System.out.println(myString.isUpperCase(2));
		System.out.println(myString.isLowerCase(2));
		System.out.println(myString.charAt(2));
		System.out.println(myString.toString());
	}// end main( )

}// end class
