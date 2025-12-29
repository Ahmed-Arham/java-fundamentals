/*
 * Topic: String vs StringBuilder
 * Description: Demonstrates immutability
 */

public class StringBuilderVsString {
    public static void main(String[] args) {

        String s = "Hello";
        s.concat(" World");
        System.out.println("String: " + s);

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("StringBuilder: " + sb);
    }
}
