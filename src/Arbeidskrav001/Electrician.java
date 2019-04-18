package Arbeidskrav001;

public class Electrician extends Worker {
    protected double wiringCost = 0.0;

    protected Electrician(String firstName, String lastName, Address address, int idNumber, double hoursWorked, double hourlyRate) {
        super(firstName, lastName, address, idNumber, hoursWorked, hourlyRate);
    }

    protected void setWiringCosts(double amount) {
        wiringCost = amount;
    }

    public String work() {
        return  "Electronics installation";
    }

    public double calculatePay() {
        return hoursWorked * hourlyRate + wiringCost;
    }
}
