package vending.menu.main;

import vending.menu.Command;
import vending.menu.manager.ManagerMenu;

public class ManagerMenuCommand extends Command {

    public ManagerMenuCommand() {
        super("Manage");
    }

    @Override
    public void execute() {
        new ManagerMenu().execute();
    }
}
