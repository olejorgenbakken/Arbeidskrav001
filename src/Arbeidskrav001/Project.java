/*
    * This class includes methods that make the total project.
 */

package Arbeidskrav001;
import java.time.LocalDate;
import java.util.ArrayList;

public class Project {
    protected ArrayList<Worker> workers = new ArrayList<>();
    protected String projectName, customer;
    protected Address projectAddress;
    protected double overheadPercent;
    protected LocalDate startDate, endDate;

    public Project(String projectName, String customer, Address projectAddress,
                           LocalDate startDate, LocalDate endDate, double overheadPercent) {
        this.projectName = projectName;
        this.customer = customer;
        this.projectAddress = projectAddress;
        this.startDate = startDate;
        this.endDate = endDate;
        this.overheadPercent = overheadPercent;
    }

    public Project(String projectName, String customer, Address projectAddress,
                           double overheadPercent) {
        this.projectName = projectName;
        this.customer = customer;
        this.projectAddress = projectAddress;
        this.overheadPercent = overheadPercent;
    }
}
