package Arbeidskrav001;

public class Worker {
    public String firstName, lastName;
    public Address address;
    public int idNumber;
    public double hoursWorked, hourlyRate;

    public String work() {
        return "This is an overwritten method";
    }

    public Worker(String firstName, String lastName, Address address, int idNumber, double hoursWorked, double hourlyRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.idNumber = idNumber;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double calculatePay() {
        return hoursWorked * hourlyRate;
    }

    public String toString() {
        return work() + ", " + firstName + " " + lastName + " is owed " + calculatePay() + "\n\r";
    }
}
