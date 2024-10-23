import java.time.LocalDate;

public class Salesman extends Employee {
    private double totalSales;
    private static double commission = 0.15;
    public Salesman(int id, String firstName, String lastName, String address, LocalDate birthDate, int empId, String department, double totalSales) {
        super(id, firstName, lastName, address, birthDate, empId, department);
        this.totalSales = totalSales;
    }

    @Override
    public double calculateSalary() {
        double baseSalary = 3000;
        return baseSalary + (totalSales * commission);
    }
}
