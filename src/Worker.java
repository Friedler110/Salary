import java.time.LocalDate;

public class Worker extends Employee{
    private double baseSalary;
    private int workingHours;

    public Worker(int id, String firstName, String lastName, String address, LocalDate birthDate, int empId, String department, double baseSalary, int workingHours) {
        super(id, firstName, lastName, address, birthDate, empId, department);
        this.baseSalary = baseSalary;
        this.workingHours = workingHours;
    }

    @Override
    public double calculateSalary() {
        double tax = 0.35;
        double salary = baseSalary - (baseSalary * tax);
        salary += (baseSalary * 0.05 * super.getAge());
        return salary;
    }
}
