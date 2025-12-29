import java.util.Scanner;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class StudentManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[2];

        for (int i = 0; i < students.length; i++) {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            students[i] = new Student(id, name);
        }

        for (Student s : students) {
            System.out.println(s.id + " " + s.name);
        }

        sc.close();
    }
}
