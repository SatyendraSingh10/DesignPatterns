package in.ss.design.patterns.behavioral.chainofresponsibility;

class CORMainTest {

    public static void main(String[] args) {

        ATMMoneyDispenser atmMoneyDispenser = new ATMMoneyDispenser();
        atmMoneyDispenser.runDispenser(new Currency(2580));

    }
}
