package in.ss.design.patterns.concepts.oop;


import lombok.Data;
import lombok.NonNull;

@Data
abstract public class Animal {
    @NonNull
    private String name;
    @NonNull
    private double height;
    @NonNull
    private int weight;
    private String sound;


}
