package java010_abstract_interface.part02;

public abstract class Shape {
	private int width;
	private int height;

	public Shape() {

	}

	public Shape(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}
	
	public abstract double getArea();  //추상메소드
}// end class
