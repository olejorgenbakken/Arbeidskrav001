This is the task given to us as a mandatory exercise in programming 103.

General information and description:

The assignment starts with a set of business requirements. The business problem we are going to address is providing a report of upcoming projects for a general contracting business.

A general contractor is hired for various type of projects from building a house to minor repairs. For this application, the contractor wants to keep track of the employees working on a project, the project customer’s name and address, and the start and end date for the project.

The application must be able to:

Create a project with a start date, end date, customer name, address of the project, description, estimated cost, overhead percentage for the contractor, and a list of workers
Print out the list of projects including the project address location
Compare two projects and determine which project must be done first based on the start date 
This is a small company that hires the following types of workers:

Electrician
Plumber
Carpenter
The workers are paid hourly, but they also each have additional expenses. It is also important to understand that the general contractor might not need all of these workers for every project. For example, if the contractor is building a new house, she needs all three types of workers. But if she is only adding an extra room onto an existing house, she might only need an electrician and a carpenter.

For this assignment, the application is designed with a minimal amount of information about each project, but it is used to demonstrate the concepts from this unit. It also provides the framework for a larger, more comprehensive application such as adding inventory tracking for the general contractor. Lets review the classes need for this application:

Since the contractor might have one or many projects going on at the same time, the program is designed to allow multiple projects to be created. Each project might have one or more workers assigned to the project. Examples of projects include building a house, adding an addition, renovating a bathroom, or even just adding outdoor motion lights. Based on the business requirements for this application, we have determined we need the following classes:

Project class represents the information needed for the project
Address class is used any time an address is needed, for example, the location of the project or the address of the workers
Worker class contains general information about all workers
Electrician, Plumber, Carpenter classes extend the Worker class
The electrician, plumber and carpenter are types of workers, so each of these classes will extend the worker class. The class diagram at the end of the document gives an overview of the program and also serves as help for the implementation. 

Project class:The project class in this application will do most of the heavy lifting.

If you do the optional task the Project class should implement the Comparable interface (https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html).

The constructor for this class is setup to take in the project name, owner name, address of the project, and the start/end dates of the project. Since some projects might not have start and end dates assigned yet, there are two overloaded constructors for this class.

Constructor 1: public Project(String projectName, String customer, Address projectAddress, LocalDate startDate, LocalDate endDate)

Constructor 2: public Project(String projectName, String customer, Address projectAddress) Note: this is an printing error in the book and should be customer for both constructors and not owner for the second one!

The calculateProjectCost method calculates the total cost of the project. The cost is calculated as following. Sum up the calculatePay results for all workers assigned to the project. Multiply this sum with the overheadPercent which gives your the overheadAmount. Sum these two together (sum of calculatePay of all workers plus overheadAmount).

Note: In the book the main test method contains a function printPayroll from the project class which is not included in the class diagram (at the very end). This is for the follow up example and you do not have to include it (but you can if you want!).

Address class: This class is used to create an address object for either the worker or the location of the project. The address class also has two constructors.

Constructor 1: public Address(String street1, String city, String state, String zip)

Constructor 2: public Address(String street1, String street2, String city, String state, String zip)

Worker class:  The worker class contains all the general information about a worker. This class will act as a superclass to the electrician, plumber and carpenter classes. Both the doWork() and the toString() methods will be overridden in each subclass, these are examples of polymorphism. Worker has one constructor.

Constructor: public Worker(String firstName, String lastName, Address address, int idNumber, double hoursWorked, double hourlyRate)

Carpenter class: This class extends the Worker class. One of the differences between the superclass worker and the carpenter class is that it allows for the additional cost for lumber materials. It also overrides the doWork() and toString() methods which is an example that enables polymorphism. This happens when a Worker object is assigned a reference type of a Carpenter object and then invokes any of the overridden methods. The JVM first attempts to invoke the method in the Carpenter class, if it is not found, then it looks for the method in the superclass. Carpenter has also one constructor which is using the Worker constructor.

Constructor: public Carpenter(String firstName, String lastName, Address address, int idNumber, double hoursWorked, double hourlyRate)

The calculatePay method is doing the following calculation: hoursWorked * hourlyRate + lumberCosts. This is needed for the calculateProjectCost method in the project class.

Electrician class: This class also extends the Worker class. For this activity, we have included a variable to allow for additional expenses such as associated wiring costs. Since the Electrician class extends the Worker class, the constructor takes in the values for name, address, id number, hours and rate and uses the keyword super to assign these values to the instance data. This can be helpful especially if we need data validation, for example, if we want to make sure the hours and rate are not negative. This logic can be included once in the Worker class and then each subclass benefits from this data validation. The constructor for Electrician is defined as follows.

Constructor: public Electrician(String firstName, String lastName, Address address, int idNumber, double hoursWorked, double hourlyRate) 

The calculatePay method is doing the following calculation: hoursWorked * hourlyRate + wiringCost. This is needed for the calculateProjectCost method in the project class.

Plumber class: Plumber also extends the Worker class. There are definitely more differences between these types of workers, but to keep the code to a minimum we will keep it simple. So, the Plumber class is very similar to the Carpenter and Electrician classes. But we added a variable for any additional costs associated with plumbing materials. Also the Plumber has only one constructor (use super to chain to parent constructor)

Constructor: public Plumber(String firstName, String lastName, Address address, int idNumber, double hoursWorked, double hourlyRate)

The calculatePay method is doing the following calculation: hoursWorked * hourlyRate + plumbingMaterials. This is needed for the calculateProjectCost method in the project class.

LocalDate class from the java.time package: This class we will reuse from the Java library so that we do not have to implement our own date class. Specifically, we use it to create date objects for the start/end dates for each project. Here is an example of how it can be used:

import java.time.LocalDate;
LocalDate start1 = LocalDate.parse("2019-11-03"); 
LocalDate end1 = LocalDate.parse("2020-05-29");
Tasks to perform:

The following tasks need to be performed to pass the assignment.

Implement the 6 classes as described above and in the class diagram.
Write a main test class called ContractorTest. In this class do the following:
Create Address objects for two customers
Use the LocalDate class from the java.time package from the Java API to create date objects for the start/end dates for each project
Create two projects, one for a new house and one for a small project to add outdoor motion lighting
Create Address objects for all the workers, the last worker uses an overloaded constructor since this worker has a second address line for the apartment number
Add three workers, an electrician, plumber, and carpenter that can be used on these projects
Add these workers to an ArrayList so that we can assign them to a project
Add all three workers to the house project
Set the lumber costs of the carpenter to $2000 Hint: ((Carpenter)c).setLumberCosts(2000);
Set the general contractor overhead to 18% for this large project
Print out the project information
Repeat the process for the small outdoor motion lighting project
Optional if you implemented the comparable interface: Compare the start dates to determine which project needs to start first and print the appropriate message
Submit the assignment as exported IntelliJ project (in IntelliJ: File -> export to Zip file)
Make sure that your code is running in IntelliJ without a compile error. Otherwise, this will lead to automatic not passed.
