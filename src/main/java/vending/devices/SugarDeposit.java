package vending.devices;

public class SugarDeposit extends Device {

    private static final int MINIMUM = 12;

    public SugarDeposit(Panel panel) {
        super(panel);
        this.panel.set(this);
    }

    @Override
    protected Boolean checkQuantity() {
        return this.hasEnoughMilligrams();
    }

    protected Boolean hasEnoughMilligrams() {
        return quantity >= SugarDeposit.MINIMUM;
    }


    @Override
    public String toString() {
        return "SugarDeposit [quantity=" + quantity + "]";
    }
}
