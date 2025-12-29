public class FinallyBlock {
    public static void main(String[] args) {
        try {
            int a = 10 / 2;
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
