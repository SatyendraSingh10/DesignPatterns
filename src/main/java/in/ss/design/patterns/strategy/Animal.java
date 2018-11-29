package in.ss.design.patterns.strategy;


import lombok.Data;
import lombok.NonNull;

@Data
public class Animal {
    public Flys flyingType;
    @NonNull
    private String name;
    @NonNull
    private double height;
    @NonNull
    private int weight;
    private String sound;


}
