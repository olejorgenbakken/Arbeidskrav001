package Arbeidskrav001;

public class Carpenter extends Worker {
    public double lumberCost;

    public Carpenter(String firstName, String lastName, Address address, int idNumber, double hoursWorked, double hourlyRate) {
        super(firstName, lastName, address, idNumber, hoursWorked, hourlyRate);
    }

    public void setLumberCosts(double amount) {
        lumberCost = amount;
    }

    public String work() {
        return "Construction work";
    }

    public double calculatePay() {
        return hoursWorked * hourlyRate + lumberCost;
    }
}
