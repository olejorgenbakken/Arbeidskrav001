package Arbeidskrav001;

public class Plumber extends Worker {
    protected double plumbingMaterials = 0.0;

    protected Plumber(String firstName, String lastName, Address address, int idNumber, double hoursWorked, double hourlyRate) {
        super(firstName, lastName, address, idNumber, hoursWorked, hourlyRate);
    }

    protected void setPlumbingCosts(double amount) {
        plumbingMaterials = amount;
    }

    public String work() {
        return "Plumbing";
    }

    public double calculatePay() {
        return hoursWorked * hourlyRate + plumbingMaterials;
    }
}
