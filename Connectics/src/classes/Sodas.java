package classes;

public class Sodas extends Product {


	private double liters;

	public Sodas(String name, double liters, int price) {
		
		super(name, price);
		this.liters = liters;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Nombre: ")
			.append(this.name)
			.append(" /// Litros: ")
			.append(this.liters)
			.append(" /// Precio: $")
			.append(this.price)
			.append(System.lineSeparator());
		
		return sb.toString();
	}
}
