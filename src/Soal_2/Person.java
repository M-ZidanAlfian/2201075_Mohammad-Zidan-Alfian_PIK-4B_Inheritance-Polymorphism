
package Soal_2;

public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String email;

    public Person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person [Name: " + name + ", address: " + address + ", phoneNumber: " + phoneNumber + ", email: " + email + "]";
    }
}
