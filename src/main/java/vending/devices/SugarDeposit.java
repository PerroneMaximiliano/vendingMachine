package vending.devices;

public class SugarDeposit extends Subject {

    protected Integer quantity;

    private static final int MINIMUM = 80;

    public SugarDeposit() {
        quantity = 0;
    }

    public void add(int quantity) {
        this.quantity += quantity;
    }

    public void remove(int quantity) {
        this.quantity -= quantity;
    }

    protected Boolean hasEnoughMilligrams() {
        return quantity >= SugarDeposit.MINIMUM;
    }

    @Override
    public String toString() {
        return "SugarDeposit [quantity=" + quantity + "]";
    }
}
