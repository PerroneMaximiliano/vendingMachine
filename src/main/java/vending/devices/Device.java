package vending.devices;

public abstract class Device {

    protected Panel panel;

    protected Integer quantity;

    public Device(Panel panel) {
        this.panel = panel;
        this.quantity = 0;
    }

    public void add(int quantity) {
        this.quantity += quantity;
        if (this.checkQuantity()) {
            panel.activeVending();
        }
    }

    public void remove(int quantity) {
        this.quantity -= quantity;
        if (!this.checkQuantity()) {
            panel.deactiveVending();
        }
    }

    protected abstract Boolean checkQuantity();
}
