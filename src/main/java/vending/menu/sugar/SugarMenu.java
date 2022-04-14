package vending.menu.sugar;

import vending.Product;
import vending.menu.Menu;

public final class SugarMenu extends Menu {

	protected Product product;
	
	public SugarMenu(Product product) {
		super();
		this.product = product;
		commandList.add(new SugarCommand("Little", 0, product));
		commandList.add(new SugarCommand("Medium", 10, product));
		commandList.add(new SugarCommand("Much", 20, product));
	}
	
}
