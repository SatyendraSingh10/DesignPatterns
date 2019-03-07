package in.ss.design.patterns.behavioral.chainofresponsibility;

interface MoneyDispenseChain {

    void setNextChain(MoneyDispenseChain chain);

    void dispenseMoney(Currency currency);
}
