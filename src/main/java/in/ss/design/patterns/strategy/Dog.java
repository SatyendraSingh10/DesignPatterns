package in.ss.design.patterns.strategy;

class Dog extends Animal {

    public Dog(String name, double height, int weight) {
        super(name, height, weight);
        this.flyingType = new CantFly();
    }

    public void digHole() {
        System.out.println("Dug hole");
    }

    public void setSound() {
        System.out.println("bow");
    }

}
