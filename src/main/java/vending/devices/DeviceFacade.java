package vending.devices;

public class DeviceFacade {

    private static DeviceFacade deviceFacade;

    public static DeviceFacade instance() {
        if (deviceFacade == null) {
            deviceFacade = new DeviceFacade();
        }
        return deviceFacade;
    }

    private DeviceFacade() {
        panel = new Panel();
        cartridgeCharger = new CartridgeCharger(panel);
        sugarDeposit = new SugarDeposit(panel);
        waterTank = new WaterTank(panel);
    }

    public void sell() {
        panel.sell();
    }

    public boolean isActiveVending() {
        return panel.isActiveVending();
    }

    private CartridgeCharger cartridgeCharger;

    private SugarDeposit sugarDeposit;

    private WaterTank waterTank;

    private Panel panel;

    public void addCoffe(Integer amount) {
        cartridgeCharger.add(amount);
    }

    public void addSugar(int amount) {
        sugarDeposit.add(amount);
    }

    public void addWater(int amount) {
        waterTank.add(amount);
    }

    public void removeCoffe(Integer quantity) {
        cartridgeCharger.remove(quantity);
    }

    public void removeSugar(int sugarConsumption) {
        sugarDeposit.remove(sugarConsumption);
    }

    public void removeWater(int waterConsumption) {
        waterTank.remove(waterConsumption);
    }

    @Override
    public String toString() {
        return "DeviceFacade [\ncartridgeCharger=" + cartridgeCharger
                + "\nsugarDeposit=" + sugarDeposit
                + "\nwaterTank=" + waterTank
                + "\npanel=" + panel + "]";
    }
}

