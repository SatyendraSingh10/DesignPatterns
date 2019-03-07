package in.ss.design.patterns.behavioral.strategy;


import lombok.Data;
import lombok.NonNull;

@Data
class Animal {
    public Flys flyingType;
    @NonNull
    private String name;
    @NonNull
    private double height;
    @NonNull
    private int weight;
    private String sound;


}
