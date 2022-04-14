package vending.devices;

import vending.menu.main.MainMenu;

public class Panel {

    private CartridgeCharger cartridgeCharger;

    private SugarDeposit sugarDeposit;

    private WaterTank waterTank;

    private MainMenu mainMenu;

    private Boolean isVendingActive;

    public Panel() {
        this.isVendingActive = Boolean.FALSE;
    }
    
    public void set(CartridgeCharger cartridgeCharger) {
        this.cartridgeCharger = cartridgeCharger;
    }

    public void set(SugarDeposit sugarDeposit) {
        this.sugarDeposit = sugarDeposit;
    }

    public void set(WaterTank waterTank) {
        this.waterTank = waterTank;
    }

    public void activeVending() {
        if (this.isActiveVending()) {
            this.isVendingActive = Boolean.TRUE;
        }
    }

    public void deactiveVending() {
        this.isVendingActive = Boolean.FALSE;
    }

    public boolean isActiveVending() {
        return cartridgeCharger.hasCartridgeCharger() && sugarDeposit.hasEnoughMilligrams() && waterTank.hasEnoughMilliliters();
    }

    public void sell(){
        mainMenu = new MainMenu();
        mainMenu.execute();
    }

    @Override
    public String toString() {
        return "Panel [active=" + isVendingActive + "]";
    }

}
