package vending.menu.manager;

import vending.devices.DeviceFacade;
import vending.menu.Command;
import vending.utils.LimitedIntDialog;

public class AddCartridgeChargerCommand extends Command {

    public AddCartridgeChargerCommand() {
        super("Add coffee cartridges");
    }

    @Override
    public void execute() {
        int quantity = LimitedIntDialog.instance().read("Amount of coffee cartridges?", 100);
        DeviceFacade.instance().addCoffe(quantity);
    }
}
