package vending.menu.manager;

import vending.menu.Menu;

public class ManagerMenu extends Menu {

    public ManagerMenu() {
        commandList.add(new AddCartridgeChargerCommand());
        commandList.add(new AddSugarCommand());
        commandList.add(new AddWaterTankCommand());
    }
}
