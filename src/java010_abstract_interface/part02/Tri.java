package java010_abstract_interface.part02;

public class Tri  extends Shape{
	
	public Tri() {
	
	}

	public Tri(int width, int height) {
		super(width, height);
	}
	
	
	@Override
	public double getArea() {		
		return getWidth() * getHeight()  / (double)2;  
	}
	
} //end class
