// Main.java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList to store Employee objects
        ArrayList<Employee> employees = new ArrayList<>();

        // Adding Employee objects
        employees.add(new Employee(101, "Alice Johnson", 50000));
        employees.add(new Employee(102, "Bob Smith", 60000));
        employees.add(new Employee(103, "Charlie Brown", 55000));

        // Display all employee details
        System.out.println("Employee Details:");
        System.out.println("--------------------------");
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
