package java008_static_access.part04;

// javac -d Java087_args.java
// java -cp . java008_static_access.part04.Java087_args hello world 2025  

public class Java087_args {

	public static void main(String[] args) {
		//System.out.println(args[0]);
		//System.out.println(args[1]);
		
		for (String data : args) {
			System.out.println(data);
		}

	}// end main()

}// end class
