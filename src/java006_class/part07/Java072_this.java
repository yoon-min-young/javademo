package java006_class.part07;

public class Java072_this {

	public static void main(String[] args) {
		Product pt = new Product("s001", "공산품", 4000);
		//pt.display();
		pt.process();
		
		Product pd = new Product(); // 1
		pd.process(); // 11
		
	} // end main()

}// end class
