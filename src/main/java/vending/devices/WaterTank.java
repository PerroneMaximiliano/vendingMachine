package vending.devices;

public class WaterTank extends Subject {

    protected Integer quantity;

    private static final int MINIMUM = 100;

    public WaterTank() {
        quantity = 0;
    }

    public void add(int quantity) {
        this.quantity += quantity;
    }

    public void remove(int quantity) {
        this.quantity -= quantity;
    }

    protected boolean hasEnoughMilliliters() {
        return quantity > WaterTank.MINIMUM;
    }

    @Override
    public String toString() {
        return "WaterTank [quantity=" + quantity + "]";
    }
}
