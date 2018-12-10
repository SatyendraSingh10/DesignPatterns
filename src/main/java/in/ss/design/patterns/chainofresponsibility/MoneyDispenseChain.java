package in.ss.design.patterns.chainofresponsibility;

interface MoneyDispenseChain {

    void setNextChain(MoneyDispenseChain chain);

    void dispenseMoney(Currency currency);
}
