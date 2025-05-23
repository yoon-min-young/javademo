package java007_class.part01;

public class Goods {
	String name; // 상품명
	int price; // 가격
	int numberOfStock; // 상품제고
	int sold; // 팔린 수량

	public Goods() {
	}

	public Goods(String name, int price, int numberOfStock, int sold) {
		this.name = name;
		this.price = price;
		this.numberOfStock = numberOfStock;
		this.sold = sold;
	}

	
	public String toString() {
		return String.format("%-14s  %8d  %5d %5d", name, price, numberOfStock, sold);
	}
}// end class
