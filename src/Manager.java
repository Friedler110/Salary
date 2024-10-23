import java.time.LocalDate;

public class Manager extends Employee{
    private double monthlySalary;
    private int numOfNewWorkers;

    public Manager(int id, String firstName, String lastName, String address, LocalDate birthDate, int empId, String department, double monthlySalary, int numOfNewWorkers) {
        super(id, firstName, lastName, address, birthDate, empId, department);
        this.monthlySalary = monthlySalary;
        this.numOfNewWorkers = numOfNewWorkers;
    }

    @Override
    public double calculateSalary() {
        double bonus = 300 * numOfNewWorkers;
        double salary = monthlySalary + bonus;

        if (salary > 5000) {
            salary -= 1000;
        } else if (salary < 1000) {

            salary += Math.min(salary * 0.10, 2000);
        }
        return salary;
    }
}
