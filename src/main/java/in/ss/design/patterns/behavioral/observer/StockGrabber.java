package in.ss.design.patterns.behavioral.observer;

import lombok.Getter;

import java.util.ArrayList;

@Getter
public class StockGrabber implements Subject {

    private final ArrayList<Observer> observers;

    private double ibmsPrice;
    private double applesPrice;
    private double googlesPrice;

    public StockGrabber() {
        observers = new ArrayList<>();
    }


    @Override
    public void register(Observer addObserver) {
        observers.add(addObserver);
    }

    @Override
    public void unregister(Observer deleteObserver) {
        observers.remove(deleteObserver);
        System.out.println("deletedObserver" + deleteObserver);
    }

    @Override
    public void notifyObserver() {
        observers.forEach((observer) -> observer.update(ibmsPrice, applesPrice, googlesPrice));
    }

    public void setIbmsPrice(double ibmsPrice) {
        this.ibmsPrice = ibmsPrice;
        notifyObserver();
    }

    public void setApplesPrice(double applesPrice) {
        this.applesPrice = applesPrice;
        notifyObserver();
    }

    public void setGooglesPrice(double googlesPrice) {
        this.googlesPrice = googlesPrice;
        notifyObserver();
    }
}
