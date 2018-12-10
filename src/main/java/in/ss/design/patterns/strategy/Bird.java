package in.ss.design.patterns.strategy;

class Bird extends Animal {
    public Bird(String name, double height, int weight) {
        super(name, height, weight);
        this.flyingType = new ItFlys();

    }
}
