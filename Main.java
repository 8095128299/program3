class Employee extends Person {
    private int empId;
    private double salary;

    // Constructor
    public Employee(String name, String dobString, int empId, double salary) {
        super(name, dobString);
        this.empId = empId;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        displayPersonName();
        displayAge();
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: $" + salary);
    }
}

// Example usage
public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Anand", "06-05-1995", 101, 50000.0);
        emp.displayEmployeeDetails();
    }
}