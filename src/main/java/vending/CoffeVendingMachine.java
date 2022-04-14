package vending;

import vending.devices.DeviceFacade;

public class CoffeVendingMachine {

	private void exec() {
		DeviceFacade.instance().sell();
	}

	public static void main(String[] args) {
		new CoffeVendingMachine().exec();
	}
}
