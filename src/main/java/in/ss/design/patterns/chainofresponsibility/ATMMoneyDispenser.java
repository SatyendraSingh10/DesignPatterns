package in.ss.design.patterns.chainofresponsibility;

class ATMMoneyDispenser {

    private final MoneyDispenseChain dispenseChain;

    //initialize ATMMoneyDispenser
    public ATMMoneyDispenser() {
        this.dispenseChain = new Rupees500Dispenser();
        MoneyDispenseChain dispenseChainOf200 = new Rupees200Dispenser();
        MoneyDispenseChain dispenseChainOf100 = new Rupees100Dispenser();
        MoneyDispenseChain dispenseChainOf50 = new Rupees50Dispenser();
        MoneyDispenseChain dispenseChainOf20 = new Rupees20Dispenser();
        MoneyDispenseChain dispenseChainOf10 = new Rupees10Dispenser();

        //dispensing chain
        dispenseChain.setNextChain(dispenseChainOf200);
        dispenseChainOf200.setNextChain(dispenseChainOf100);
        dispenseChainOf100.setNextChain(dispenseChainOf50);
        dispenseChainOf50.setNextChain(dispenseChainOf20);
        dispenseChainOf20.setNextChain(dispenseChainOf10);
    }

    public void runDispenser(Currency currency) {
        if (isAmountValid(currency)) {
            try {
                dispenseChain.dispenseMoney(currency);
            } catch (RuntimeException ex) {
                System.out.println("Exception occurred : " + ex.getMessage());
            }
        } else {
            System.out.println("Invalid amount.Amount should be in multiple of 10,20,50,100,200 and 500");
        }
    }

    private boolean isAmountValid(Currency currency) {
        int MINIMUM_CURRENCY_VALUE = 10;
        return currency.getAmount() % MINIMUM_CURRENCY_VALUE == 0;
    }
}
