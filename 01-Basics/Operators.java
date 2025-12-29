/*
 * Topic: Operators
 * Description: Demonstrates different operators in Java
 */

public class Operators {
    public static void main(String[] args) {

        int a = 10, b = 5;

        System.out.println("Arithmetic:");
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

        System.out.println("Relational:");
        System.out.println(a > b);
        System.out.println(a < b);

        System.out.println("Logical:");
        System.out.println(a > 5 && b < 10);
        System.out.println(a > 5 || b > 10);
    }
}
