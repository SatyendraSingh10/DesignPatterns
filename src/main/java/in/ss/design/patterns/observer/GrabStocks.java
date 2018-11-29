package in.ss.design.patterns.observer;

public class GrabStocks {

    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();
        StockObserver stockObserver = new StockObserver(stockGrabber);
        StockObserver stockObserver1 = new StockObserver(stockGrabber);
        StockObserver stockObserver2 = new StockObserver(stockGrabber);


        //stockGrabber.register(stockObserver);

        stockGrabber.setApplesPrice(238.00);
        stockGrabber.setGooglesPrice(568.78);
        stockGrabber.setIbmsPrice(765.87);

        Runnable getIBM = new GetTheStock(stockGrabber, 2, "IBM", 123.00);
        Runnable getAAPL = new GetTheStock(stockGrabber, 2, "AAPL", 543.00);
        Runnable getGOOG = new GetTheStock(stockGrabber, 2, "GOOG", 765.00);
        new Thread(getIBM).start();
        new Thread(getAAPL).start();
        new Thread(getGOOG).start();
    }
}
