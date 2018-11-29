package in.ss.design.patterns.concepts.oop;

public class Dog extends Animal {

    public Dog(String name, double height, int weight) {
        super(name, height, weight);
    }

    public void digHole() {
        System.out.println("Dug hole");
    }

    public void setSound() {
        System.out.println("bow");
    }

}
