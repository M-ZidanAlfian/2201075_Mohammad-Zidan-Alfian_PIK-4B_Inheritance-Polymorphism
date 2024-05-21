
package Soal_2;

public class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String email, String office, double salary, MyDate dateHired, String officeHours, String rank) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty [Name: " + getName() + ", Rank: " + rank + ", Office Hours: " + officeHours + "]";
    }
}
