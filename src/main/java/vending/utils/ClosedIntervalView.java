package vending.utils;

class ClosedIntervalView {
	private String title;
	private ClosedInterval closedInterval;
	
	public ClosedIntervalView(String title, ClosedInterval closedInterval) {
		this.title = title;
		this.closedInterval = closedInterval;
	}
	
	public void writeln() {
		Console.instance().writeln(title + " " + this.toString());
	}
	
	@Override
	public String toString() {
		return "[" + closedInterval.getMin() + ", " + closedInterval.getMax() + "]";
	}
}
