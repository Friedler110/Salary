import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Worker(1, "aa", "a", "123", LocalDate.of(1985, 5, 10), 1001, "Working", 5000, 40));
        employees.add(new Salesman(2, "bb", "b", "456", LocalDate.of(1990, 7, 20), 1002, "Sales", 20000));
        employees.add(new Manager(3, "cc", "d", "789", LocalDate.of(1970, 3, 15), 1003, "Management", 8000, 2));
        employees.add(new SeniorManager(4, "dd", "d", "1010", LocalDate.of(1960, 2, 1), 1004, "Senior Management", 10000, 1, 3000));

        for (Employee employee : employees) {
            System.out.println(employee.getClass().getSimpleName() + " Salary: " + employee.calculateSalary());
        }
    }
}