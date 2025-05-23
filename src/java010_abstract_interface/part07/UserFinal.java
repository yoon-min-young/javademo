package java010_abstract_interface.part07;

public class UserFinal  extends FinalTest{
	
	public UserFinal() {
	
	}	
	
	@Override
	void display() {
		System.out.println("UserFinal display()");
	}
	
    //Cannot override the final method from FinalTest
	//void process() {  }
	
} //end class
