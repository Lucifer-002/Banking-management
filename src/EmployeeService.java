import java.util.*;
public class EmployeeService {
	private List<Employee> employeeList = new ArrayList<>();
	
	public void registerEmployee(Scanner scanner) {
        System.out.print("Enter Employee ID (long): ");
        long id = scanner.nextLong();  // Changed to long
        scanner.nextLine();  // Consume newline
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();
        System.out.print("Enter Contact Number: ");
        String contactNumber = scanner.nextLine();

        employeeList.add(new Employee(id, name, email, password, address, contactNumber));
        System.out.println("Employee registered successfully!");
    }
	
	public boolean loginEmployee(Scanner scanner) {
        System.out.print("Enter Employee ID (long): ");
        long id = scanner.nextLong();  // Changed to long
        scanner.nextLine();  // Consume newline
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        for (Employee emp : employeeList) {
            if (emp.getEmployeeId() == id && emp.getPassword().equals(password)) {
                System.out.println("Login successful!");
                return true;
            }
        }
        System.out.println("Invalid credentials.");
        return false;
    }
}
