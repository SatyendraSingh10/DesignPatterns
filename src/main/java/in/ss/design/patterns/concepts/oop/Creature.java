package in.ss.design.patterns.concepts.oop;


abstract class Creature {
    String name;
    int weight;
    String sound;

    public abstract String getSound();

    public abstract void setSound(String sound);

    public abstract int getWeight();

    public abstract void setWeight(int weight);

    public abstract String getName();

    public abstract void setName(String name);
}

