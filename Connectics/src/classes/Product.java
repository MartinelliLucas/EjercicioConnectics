package classes;

public abstract class Product implements Comparable<Product> {
	
	protected String name;
	protected int price;

	public Product(String name, int price) {
		
		this.name = name;
		this.price = price;
	}
	
	@Override
	public int compareTo (Product other) {
		
		if (this.price == other.price) 
			return 0;
		
		if (this.price > other.price) 
			return 1;
		
		else
			return -1;
		
	}
}
