package classes;

public class GreenGrocery extends Product{
	
	private String unitSellType;
	
	public GreenGrocery (String name, int price, String unitSellType) {
		
		super (name, price);
		this.unitSellType = unitSellType;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Nombre: ")
			.append(this.name)
			.append(" /// Precio: $")
			.append(this.price)
			.append(" /// Unidad de venta: ")
			.append(this.unitSellType)
			.append(System.lineSeparator());

		return sb.toString();
	}
}
