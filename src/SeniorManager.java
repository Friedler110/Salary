import java.time.LocalDate;

public class SeniorManager extends Manager{
    private double bonus;

    public SeniorManager(int id, String firstName, String lastName, String address, LocalDate birthDate, int empId, String department, double monthlySalary, int numOfNewWorkers, double bonus) {
        super(id, firstName, lastName, address, birthDate, empId, department, monthlySalary, numOfNewWorkers);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        double salary = super.calculateSalary();
        return salary + bonus;
    }
}
