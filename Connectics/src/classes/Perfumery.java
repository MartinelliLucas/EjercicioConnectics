package classes;

public class Perfumery extends Product {

	private int content;

	public Perfumery(String name, int price, int content) {

		super(name, price);
		this.content = content;
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Nombre: ")
			.append(this.name)
			.append(" /// Contenido: ")
			.append(this.content)
			.append(" /// Precio: $")
			.append(this.price)
			.append(System.lineSeparator());

		return sb.toString();
	}
}
