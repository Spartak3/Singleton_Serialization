import java.io.Serializable;

public class Singleton implements Serializable {

    private static final long serialVersionID=1231232l;


    private static Singleton singleton = new Singleton("Singleton");
    public String name ;

    private Singleton(String name) {
        this.name=name;
    }

    public static Singleton getInstance( ) {
        return singleton;
    }


    public Object readResolve() {
        return getInstance();
    }



    @Override
    public String toString() {
        return "Singleton{" +
                "name='" + name + '\'' +
                '}';
    }
}