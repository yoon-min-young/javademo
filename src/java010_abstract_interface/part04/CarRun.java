package java010_abstract_interface.part04;

//변수에 final을 선언하면 사용한다.

public interface CarRun {
	int carCount = 5;    // public static final
	
	//public CarRun() {}
	//static {}
	
	 void prn();   //public abstract
	 
	 class Sun{
		 public Sun() {
			 System.out.println("Sun constructor");
		 }
	 }
	
	 //Java8부터 default 가능함
	 default void call() {
		 System.out.println("CarRun call");
	 }	 
	 
	 //Java8부터 static 가능함
	 static void display() {
		 System.out.println("display");
	 }
} //end class











