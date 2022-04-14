package vending.devices;

public class CartridgeCharger extends Device {

    private static final int MINIMUM = 1;

    public CartridgeCharger(Panel panel) {
        super(panel);
        this.panel.set(this);
    }

    @Override
    protected Boolean checkQuantity() {
        return this.hasCartridgeCharger();
    }

    protected boolean hasCartridgeCharger() {
        return this.quantity >= CartridgeCharger.MINIMUM;
    }

    @Override
    public String toString() {
        return "CartridgeCharger [quantity=" + quantity + "]";
    }
}
