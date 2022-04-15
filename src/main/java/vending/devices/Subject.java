package vending.devices;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers;

    public Subject() {
        this.observers = new ArrayList<>();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void dettach(Observer observer) {
        observers.remove(observer);
    }

    public void notifies(boolean isActive) {
        observers.stream().forEach(observer -> observer.update(isActive));
    }
}
