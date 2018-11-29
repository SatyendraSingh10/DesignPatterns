package in.ss.design.patterns.concepts.oop;


abstract public class Creature {
    protected String name;
    protected int weight;
    protected String sound;

    public abstract String getSound();

    public abstract void setSound(String sound);

    public abstract int getWeight();

    public abstract void setWeight(int weight);

    public abstract String getName();

    public abstract void setName(String name);
}

