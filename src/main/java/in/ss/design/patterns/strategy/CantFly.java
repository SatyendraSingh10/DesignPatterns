package in.ss.design.patterns.strategy;

public class CantFly implements Flys {
    @Override
    public String fly() {
        return "Can't Fly";
    }
}
