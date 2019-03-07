package in.ss.design.patterns.behavioral.observer;

public class StockObserver implements Observer {
    private static int observerIdTracker = 0;
    private double ibmsPrice;
    private double applesPrice;
    private double googlesPrice;
    private final int observerId;

    private final Subject stockGrabber;

    public StockObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerId = ++observerIdTracker;

        System.out.println("New observer :" + observerId);
        stockGrabber.register(this);
    }

    @Override
    public void update(double ibmsPrice, double applesPrice, double googlesPrice) {
        this.ibmsPrice = ibmsPrice;
        this.applesPrice = applesPrice;
        this.googlesPrice = googlesPrice;

        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "StockObserver = " + this.observerId + "{" +
                "ibmsPrice=" + ibmsPrice +
                ", applesPrice=" + applesPrice +
                ", googlesPrice=" + googlesPrice +
                '}';
    }
}
