package in.ss.design.patterns.creational.singleton;

import lombok.SneakyThrows;

import java.io.*;
import java.lang.reflect.Constructor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Satyendra Singh
 * @project DesignPatterns
 * @package in.ss.design.patterns.creational.singleton
 * @date 22-12-2018
 * @time 15:45
 */
public class SingletonLazy implements Serializable {
    // volatile to make sure that change to be published when change is complete
    private static volatile SingletonLazy soleInstance = null; // lazy loading

    private SingletonLazy() {
        //remedy for reflection type object construction
        if (null != soleInstance)
            throw new RuntimeException("Cannot create please use get instance");
        System.out.println("Creating...");
    }

    // getInstance is called holder class is loaded and instance is returned
    public static SingletonLazy getInstance() {
       /* //double check locking
        if (null == soleInstance) {//doubly check locking idiom check 1
            synchronized (SingletonLazy.class) {
                if (soleInstance == null) { // check 2
                    soleInstance = new SingletonLazy();
                }
            }
        }
        return soleInstance;*/
        soleInstance = Holder.INSTANCE;


        return soleInstance;
    }

    private Object readResolve() throws ObjectStreamException {
        System.out.println("Read resolve");
        return soleInstance;
    }

    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Clone is not supported . use get instance instead");
    }

    //Singleton holder pattern
    static class Holder {
        static final SingletonLazy INSTANCE = new SingletonLazy();
    }
}

class TestLazyClass {

    static void useSingleton() {
        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        print("singletonLazy", singletonLazy);
    }

    @SneakyThrows
    public static void main(String[] args) {
        SingletonLazy s1 = SingletonLazy.getInstance();
        SingletonLazy s2 = SingletonLazy.getInstance();

        print("s1", s1);
        print("s2", s2);

        //violate by serialization and deserialization
        //serialization
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("C:/temp/s2.ser"));
        outputStream.writeObject(s2);

        //deserialization
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:/temp/s2.ser"));
        SingletonLazy s4 = (SingletonLazy) objectInputStream.readObject();
        print("S4", s4);

        // violated by multiple thread
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(TestLazyClass::useSingleton);
        service.submit(TestLazyClass::useSingleton);
        service.shutdown();

        try {
            //violate by cloning
            SingletonLazy s5 = (SingletonLazy) s1.clone();
            print("s5", s5);
        } catch (Exception ex) {
            System.out.println("Exception while cloning : " + ex.getMessage());
        }

        try {
            //violate by reflection
            Class clazz = Class.forName("in.ss.design.patterns.creational.singleton.SingletonLazy");
            Constructor<SingletonLazy> ctor = clazz.getDeclaredConstructor();
            ctor.setAccessible(true);
            SingletonLazy s3 = ctor.newInstance();
            print("S3", s3);
        } catch (Exception ex) {
            System.out.println("Exception while reflection : " + ex.getMessage());
        }


    }

    static void print(String name, SingletonLazy obj) {
        System.out.println(String.format("Object : %s,Hashcode : %d", name, obj.hashCode()));
    }
}

