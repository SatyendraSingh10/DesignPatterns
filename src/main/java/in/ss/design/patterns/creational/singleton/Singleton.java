package in.ss.design.patterns.creational.singleton;

import lombok.SneakyThrows;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * @author Satyendra Singh
 * @project DesignPatterns
 * @package in.ss.design.patterns.creational.singleton
 * @date 22-12-2018
 * @time 15:22
 */
public class Singleton implements Serializable, Cloneable {

    private static Singleton soleInstance = new Singleton(); // eager loading

    private Singleton() {
        System.out.println("Creating...");
    }

    public static Singleton getInstance() {
        return soleInstance;
    }

    @SneakyThrows
    protected Object clone() {
        return super.clone();
    }


}

class TestClass {
    @SneakyThrows
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        print("s1", s1);
        print("s2", s2);

        //violate by reflection
        Class clazz = Class.forName("in.ss.design.patterns.creational.singleton.Singleton");
        Constructor<Singleton> ctor = clazz.getDeclaredConstructor();
        ctor.setAccessible(true);
        Singleton s3 = ctor.newInstance();

        print("S3", s3);

        //violate by serialization and deserialization
        //serialization
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("C:/temp/s2.ser"));
        outputStream.writeObject(s2);

        //deserialization
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:/temp/s2.ser"));
        Singleton s4 = (Singleton) objectInputStream.readObject();
        print("S4", s4);

        //violate by cloning
        Singleton s5 = (Singleton) s1.clone();
        print("s5", s5);
    }

    static void print(String name, Singleton obj) {
        System.out.println(String.format("Object : %s,Hashcode : %d", name, obj.hashCode()));
    }

}
