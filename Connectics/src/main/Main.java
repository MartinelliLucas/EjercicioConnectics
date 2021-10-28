package main;

import classes.Market;

public class Main {

	public static void main(String[] args) {
		
		Market newMarket = new Market ();
		newMarket.loadProducts();
		
		System.out.println(newMarket.toString());
	}

}
