package in.ss.design.patterns.observer;

import lombok.SneakyThrows;

import java.text.DecimalFormat;
import java.util.Objects;

public class GetTheStock implements Runnable {
    private int startTime;
    private String stock;
    private double price;
    private Subject stockgrabber;

    public GetTheStock(Subject stockgrabber, int startTime, String newStock, double newPrice) {
        this.stockgrabber = stockgrabber;
        this.startTime = startTime;
        this.stock = newStock;
        this.price = newPrice;
    }

    @Override
    @SneakyThrows
    public void run() {

        for (int i = 1; i < 20; i++) {

            Thread.sleep(startTime * 2000);


            double random = (Math.random() * (.06)) - .03;
            DecimalFormat decimalFormat = new DecimalFormat("#.##");

            price = Double.valueOf(decimalFormat.format(price + random));
            if (Objects.equals(stock, "IBM")) ((StockGrabber) stockgrabber).setIbmsPrice(price);
            if (Objects.equals(stock, "AAPL")) ((StockGrabber) stockgrabber).setIbmsPrice(price);
            if (Objects.equals(stock, "GOOG")) ((StockGrabber) stockgrabber).setIbmsPrice(price);
            System.out.println("Stock : " + price + random + " " + random);
            System.out.println();

        }

    }
}
