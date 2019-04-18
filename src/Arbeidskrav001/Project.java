package Arbeidskrav001;
import java.time.LocalDate;
import java.util.ArrayList;

public class Project {
    public ArrayList<Worker> workers = new ArrayList<>();
    private String projectName, customer;
    private Address projectAddress;
    private double overheadPercent;
    private LocalDate startDate, endDate;

    public Project(String projectName, String customer, Address projectAddress, LocalDate startDate, LocalDate endDate, double overheadPercent) {
        this.projectName = projectName;
        this.customer = customer;
        this.projectAddress = projectAddress;
        this.startDate = startDate;
        this.endDate = endDate;
        this.overheadPercent = overheadPercent;
    }

    public Project(String projectName, String customer, Address projectAddress, double overheadPercent) {
        this.projectName = projectName;
        this.customer = customer;
        this.projectAddress = projectAddress;
        this.overheadPercent = overheadPercent;
    }

    private void setOverheadPercent(double overheadPercent) {
        this.overheadPercent = overheadPercent;
    }

    private double getOverheadPercent(double overheadPercent) {
        return overheadPercent;
    }

    public static void main(String[] args) {
        Address customer1 = new Address("Uglevegen 17", "0572", "Oslo", "Norge");
        Address customer2 = new Address("Sinsenveien 14", "0572", "Oslo", "Norge");

        LocalDate start1 = LocalDate.parse("2019-04-18");
        LocalDate end1 = LocalDate.parse("2021-04-18");
        Project p1 = new Project("House", "Ole Jørgen Bakken", customer1, start1, end1, .15);
        LocalDate start2  = LocalDate.parse("2018-04-19");
        LocalDate end2 = LocalDate.parse("2022-12-24");
        Project p2 = new Project("Snøhetta kontor", "Snøhetta", customer2, start2, end2, .22);

        Address electricianAddress = new Address("Uglevegen 17", "2640", "Vinstra", "Norge");
        Address carpenterAddress = new Address("Ingensteds 69", "420", "Oslo", "Norge");
        Address plumberAddress = new Address("Himmelen 12", "69", "Himmel", "Himmelen");

        Worker e = new Electrician("Peg", "Fisher", electricianAddress, 101, 25, 320);
        Worker c = new Carpenter("Yusef", "Eberly", carpenterAddress, 202, 53.5, 290);
        Worker p = new Plumber("Harley", "Davidson", plumberAddress, 301, 20.75, 270);

        p1.workers.add(c);
        p1.workers.add(e);
        p1.workers.add(p);
        ((Carpenter)c).setLumberCosts(400000);
        ((Electrician)e).setWiringCosts(60000);
        ((Plumber)p).setPlumbingCosts(50000);
        p1.setOverheadPercent(.18);

        p2.workers.add(e);
        p2.workers.add(p);


        System.out.println("The project \"" + p1.projectName + "\" is scheduled to start on the " + p1.startDate + ", and end on the " + p1.endDate + ".");
        System.out.println("The cost breakdown is calculated to look like this:");
        System.out.println("\n" + "Carpenter (" + (((Carpenter)c).firstName) + " " + (((Carpenter)c).lastName) + ") cost, including lumber:");
        System.out.println((c).calculatePay() + "\n");
        System.out.println("Electrician (" + (((Electrician)e).firstName) + " " + (((Electrician)e).lastName) + ") cost, including wiring:");
        System.out.println((e).calculatePay() + "\n");
        System.out.println("Plumber (" + (((Plumber)p).firstName) + " " + (((Plumber)p).lastName) + ") cost, including plumbing materials:");
        System.out.println((p).calculatePay() + "\n");
        System.out.println("Which comes to a total of:");
        System.out.print(((e).calculatePay() + (p).calculatePay() + (c).calculatePay()) * p1.overheadPercent + "\n");
        System.out.print("\n" + "*************************************");
    }

}
