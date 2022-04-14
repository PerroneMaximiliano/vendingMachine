package vending.menu.manager;

import vending.devices.DeviceFacade;
import vending.menu.Command;
import vending.utils.LimitedIntDialog;

public class AddWaterTankCommand extends Command {

    public AddWaterTankCommand() {
        super("Add water");
    }

    @Override
    public void execute() {
        int quantity = LimitedIntDialog.instance().read("Amount of water?", 100);
        DeviceFacade.instance().addWater(quantity);
    }
}
