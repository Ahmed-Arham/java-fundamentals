import java.io.*;

class Student implements Serializable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Serialization {
    public static void main(String[] args) {

        try {
            Student s = new Student(1, "Arham");

            FileOutputStream fos = new FileOutputStream("student.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(s);
            oos.close();

            System.out.println("Object Serialized");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
