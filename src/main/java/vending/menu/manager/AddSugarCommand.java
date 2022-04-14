package vending.menu.manager;

import vending.devices.DeviceFacade;
import vending.menu.Command;
import vending.utils.LimitedIntDialog;

public class AddSugarCommand extends Command {

    public AddSugarCommand() {
        super("Add sugar");
    }

    @Override
    public void execute() {
        int quantity = LimitedIntDialog.instance().read("Amount of sugar?", 100);
        DeviceFacade.instance().addSugar(quantity);
    }
}
