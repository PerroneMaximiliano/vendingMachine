package vending.devices;

public class WaterTank extends Device {

    private static final int MINIMUM = 100;

    public WaterTank(Panel panel) {
        super(panel);
        this.panel.set(this);
    }

    @Override
    protected Boolean checkQuantity() {
        return this.hasEnoughMilliliters();
    }

    protected boolean hasEnoughMilliliters() {
        return quantity > WaterTank.MINIMUM;
    }


    @Override
    public String toString() {
        return "WaterTank [quantity=" + quantity + "]";
    }
}
