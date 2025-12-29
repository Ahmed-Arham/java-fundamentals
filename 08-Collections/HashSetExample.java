import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(10);   // Duplicate not allowed

        System.out.println(set);
    }
}
