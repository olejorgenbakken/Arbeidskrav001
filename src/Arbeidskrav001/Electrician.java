package Arbeidskrav001;

public class Electrician extends Worker {
    private double wiringCost = 0.0;
    public Electrician(String firstName, String lastName, Address address, int idNumber, double hoursWorked, double hourlyRate) {
        super(firstName, lastName, address, idNumber, hoursWorked, hourlyRate);
    }

    public void setWiringCosts(double amount) {
        wiringCost = amount;
    }

    public String work() {
        return  "Installed electronics";
    }

    public double calculatePay() {
        return hoursWorked * hourlyRate + wiringCost;
    }
}
