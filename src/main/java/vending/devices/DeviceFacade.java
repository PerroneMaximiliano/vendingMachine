package vending.devices;

public class DeviceFacade {

    private CartridgeCharger cartridgeCharger;

    private SugarDeposit sugarDeposit;

    private WaterTank waterTank;

    private Panel panel;

    private static DeviceFacade deviceFacade;

    public static DeviceFacade instance() {
        if (deviceFacade == null) {
            deviceFacade = new DeviceFacade();
        }
        return deviceFacade;
    }

    private DeviceFacade() {
        panel = new Panel();
        cartridgeCharger = new CartridgeCharger();
        cartridgeCharger.attach(panel);
        sugarDeposit = new SugarDeposit();
        sugarDeposit.attach(panel);
        waterTank = new WaterTank();
        waterTank.attach(panel);
    }

    public void sell() {
        panel.sell();
    }

    public void addCoffe(Integer amount) {
        cartridgeCharger.add(amount);
        this.coffeEvent();
    }

    public void addSugar(int amount) {
        sugarDeposit.add(amount);
        this.sugarEvent();
    }

    public void addWater(int amount) {
        waterTank.add(amount);
        this.watterEvent();
    }

    public void removeCoffe(Integer quantity) {
        cartridgeCharger.remove(quantity);
        this.coffeEvent();
    }

    public void removeSugar(int sugarConsumption) {
        sugarDeposit.remove(sugarConsumption);
        this.sugarEvent();
    }

    public void removeWater(int waterConsumption) {
        waterTank.remove(waterConsumption);
        this.watterEvent();
    }

    private void sugarEvent() {
        sugarDeposit.notifies(this.isActiveVending());
    }

    private void watterEvent() {
        waterTank.notifies(this.isActiveVending());
    }

    private void coffeEvent() {
        cartridgeCharger.notifies(this.isActiveVending());
    }

    public boolean isActiveVending() {
        return cartridgeCharger.hasCartridgeCharger()
                && sugarDeposit.hasEnoughMilligrams()
                && waterTank.hasEnoughMilliliters();
    }

    @Override
    public String toString() {
        return "DeviceFacade [\ncartridgeCharger=" + cartridgeCharger
                + "\nsugarDeposit=" + sugarDeposit
                + "\nwaterTank=" + waterTank
                + "\npanel=" + panel + "]";
    }
}

