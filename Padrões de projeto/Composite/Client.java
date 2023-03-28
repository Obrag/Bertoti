// Client
public class Client {
    public static void main(String[] args) {
        // Create a manager
        Manager manager = new Manager("John Doe", "Engineering");

        // Create some developers
        Developer dev1 = new Developer("Jane Smith", "Junior Developer");
        Developer dev2 = new Developer("Bob Johnson", "Senior Developer");

        // Add the developers to the manager
        manager.addEmployee(dev1);
        manager.addEmployee(dev2);

        // Show the employee details
        manager.showEmployeeDetails();
    }
}