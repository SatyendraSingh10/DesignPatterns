package in.ss.design.patterns.behavioral.chainofresponsibility;

public class Rupees500Dispenser implements MoneyDispenseChain {

    private MoneyDispenseChain dispenseChain;

    @Override
    public void setNextChain(MoneyDispenseChain nextChain) {
        this.dispenseChain = nextChain;
    }

    @Override
    public void dispenseMoney(Currency currency) {
        int CURRENCY_VALUE = 500;
        if (currency.getAmount() >= CURRENCY_VALUE) {
            int counts = currency.getAmount() / CURRENCY_VALUE;
            int remainder = currency.getAmount() % CURRENCY_VALUE;

            System.out.println("Dispensing " + counts + " notes of 500 rupees. Amounting " + counts * CURRENCY_VALUE + " remainder : " + remainder);

            if (remainder > 0) {
                this.dispenseChain.dispenseMoney(new Currency(remainder));
            }

        } else {
            this.dispenseChain.dispenseMoney(currency);
        }
    }
}
