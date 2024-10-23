import java.time.LocalDate;
import java.time.Period;

class Person {
    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private LocalDate birthDate;


    public Person(int id, String firstName, String lastName, String address, LocalDate birthDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.birthDate = birthDate;
    }

    public int getAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }
}
