import java.time.LocalDate;

public abstract class Employee extends Person {
    private  int empId;
    private  String department;

    public Employee(int id, String firstName, String lastName, String address, LocalDate birthDate, int empId, String department) {
        super(id, firstName, lastName, address, birthDate);
        this.empId = empId;
        this.department = department;
    }

    public abstract double calculateSalary();

    public String getDepartment() {
        return department;
    }

}
