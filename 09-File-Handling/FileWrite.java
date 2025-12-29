import java.io.FileWriter;

public class FileWrite {
    public static void main(String[] args) {

        try {
            FileWriter fw = new FileWriter("sample.txt");
            fw.write("Hello File Handling");
            fw.close();
            System.out.println("File written successfully");
        } catch (Exception e) {
            System.out.println("Error writing file");
        }
    }
}
