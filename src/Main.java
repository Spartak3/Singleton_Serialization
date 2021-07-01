import java.io.*;

public class Main {
    static final String fName="src/file.rtf";
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //------------this is not singleton and we get different hashcodes--------------
//        Human human=new Human("Spartak","Armenia",20);
//        FileOutputStream fileOutputStream=new FileOutputStream(fName);
//        ObjectOutputStream outputStream=new ObjectOutputStream(fileOutputStream);
//        outputStream.writeObject(human);
//
//        FileInputStream fileInputStream=new FileInputStream(fName);
//        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
//        Human human2=(Human)objectInputStream.readObject();
//
//        System.out.println(human.hashCode());
//        System.out.println(human2.hashCode());
//        System.out.println(human);
//        System.out.println(human2);




        //this is singleton and we get same hashcodes
        Singleton singleton=Singleton.getInstance();

        FileOutputStream fileOutputStream=new FileOutputStream(fName);
        ObjectOutputStream outputStream=new ObjectOutputStream(fileOutputStream);
        outputStream.writeObject(singleton);


        FileInputStream fileInputStream=new FileInputStream(fName);
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        Singleton singleton1=(Singleton)objectInputStream.readObject();


        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());
        System.out.println(singleton);
        System.out.println(singleton1);




    }
}
