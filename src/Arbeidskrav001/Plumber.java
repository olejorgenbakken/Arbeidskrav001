package Arbeidskrav001;

public class Plumber extends Worker {
    private double plumbingMaterials = 0.0;
    public Plumber(String firstName, String lastName, Address address, int idNumber, double hoursWorked, double hourlyRate) {
        super(firstName, lastName, address, idNumber, hoursWorked, hourlyRate);
    }

    public void setPlumbingCosts(double amount) {
        plumbingMaterials = amount;
    }

    public String work() {
        return "Installed plumbing";
    }

    public double calculatePay() {
        return hoursWorked * hourlyRate + plumbingMaterials;
    }
}
