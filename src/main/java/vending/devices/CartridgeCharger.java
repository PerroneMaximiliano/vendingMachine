package vending.devices;

public class CartridgeCharger extends Subject {

    protected Integer quantity;

    private static final int MINIMUM = 1;

    public CartridgeCharger() {
        quantity = 0;
    }

    public void add(int quantity) {
        this.quantity += quantity;
    }

    public void remove(int quantity) {
        this.quantity -= quantity;
    }

    protected boolean hasCartridgeCharger() {
        return this.quantity >= CartridgeCharger.MINIMUM;
    }

    @Override
    public String toString() {
        return "CartridgeCharger [quantity=" + quantity + "]";
    }
}
