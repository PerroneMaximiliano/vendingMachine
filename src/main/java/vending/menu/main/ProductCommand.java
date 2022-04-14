package vending.menu.main;

import vending.Product;
import vending.devices.DeviceFacade;
import vending.menu.Command;
import vending.menu.sugar.SugarMenu;

public class ProductCommand extends Command {

	protected Product product;
	
	protected ProductCommand(Product product) {
		super(product.getDescription());
		this.product = product;
	}

	@Override
	public void execute() {
		new SugarMenu(product).execute();
		DeviceFacade.instance().removeCoffe(product.getCoffeConsumption());
		DeviceFacade.instance().removeSugar(product.getSugarConsumption());
		DeviceFacade.instance().removeWater(product.getWaterConsumption());
	}

}
