package Arbeidskrav001;

public class Worker {
    protected String firstName, lastName;
    protected Address address;
    protected int idNumber;
    protected double hoursWorked, hourlyRate;

    public String work() {
        return "This is an overwritten method";
    }

    protected Worker(String firstName, String lastName, Address address, int idNumber, double hoursWorked, double hourlyRate) {
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
        return work() + ": " + calculatePay() + "\n";
    }
}
