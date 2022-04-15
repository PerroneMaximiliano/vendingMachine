package vending.devices;

import vending.menu.main.MainMenu;

public class Panel implements Observer {

    private MainMenu mainMenu;

    private Boolean isVendingActive;

    public Panel() {
        this.isVendingActive = Boolean.FALSE;
    }

    public void sell() {
        mainMenu = new MainMenu();
        mainMenu.execute();
    }

    @Override
    public void update(boolean isActive) {
        this.isVendingActive = isActive;
    }

    @Override
    public String toString() {
        return "Panel [active=" + isVendingActive + "]";
    }
}
