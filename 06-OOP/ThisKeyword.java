class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        Person p = new Person("Arham");
        System.out.println(p.name);
    }
}
