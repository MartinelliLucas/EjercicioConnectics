package classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Market {

	private List<Product> products;

	public Market() {
		
		products = new ArrayList<Product>();
	}

	public void loadProducts() {
		
		this.products.add(new Sodas("Coca-Cola Zero", 1.5, 20));
		this.products.add(new Sodas("Coca-Cola", 1.5, 18));
		this.products.add(new Perfumery("Shampoo Sedal", 19, 500));
		this.products.add(new GreenGrocery("Frutillas", 64, "kilo"));
	}

	@Override
	public String toString() {
		
		if(this.products.size() == 0) {
			return "La lista de productos está vacia";
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (Product product : products) {
			sb.append(product.toString());
		}
		
		sb.append("=============================")
			.append(System.lineSeparator())
			.append("Producto más caro: ")
			.append(Collections.max(products).name)
			.append(System.lineSeparator())
			.append("Producto más barato: ")
			.append(Collections.min(products).name);
		
		return sb.toString();
	}

}
