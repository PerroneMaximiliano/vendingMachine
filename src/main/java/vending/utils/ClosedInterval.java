package vending.utils;

public class ClosedInterval {
	private int min;
	private int max;

	public ClosedInterval(int min, int max) {
		this.min = min;
		this.max = max;
	}

	public boolean includes(int value) {
		return min <= value && value <= max;
	}

	int getMin() {
		return min;
	}

	int getMax() {
		return max;
	}
}
