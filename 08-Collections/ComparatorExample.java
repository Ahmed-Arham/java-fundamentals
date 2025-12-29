import java.util.*;

class Employee {
    int salary;
    Employee(int salary) {
        this.salary = salary;
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(3000));
        list.add(new Employee(1000));

        Collections.sort(list, (a, b) -> a.salary - b.salary);

        for (Employee e : list)
            System.out.println(e.salary);
    }
}
