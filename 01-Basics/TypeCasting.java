/*
 * Topic: Type Casting
 * Description: Demonstrates implicit and explicit casting
 */

public class TypeCasting {
    public static void main(String[] args) {

        // Implicit Casting
        int a = 10;
        double b = a;
        System.out.println("Implicit: " + b);

        // Explicit Casting
        double x = 20.5;
        int y = (int) x;
        System.out.println("Explicit: " + y);
    }
}
