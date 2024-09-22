import java.util.Scanner;
public class Banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService employeeService = new EmployeeService();
        CustomerService customerService = new CustomerService();
        Scanner scanner = new Scanner(System.in);
        boolean loggedIn = false;

        while (true) {
            System.out.println("\n1. Register Employee");
            System.out.println("2. Login Employee");
            System.out.println("3. Add Customer");
            System.out.println("4. View Customer by SSN");
            System.out.println("5. Update Customer by SSN");
            System.out.println("6. Delete Customer by SSN");
            System.out.println("7. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    employeeService.registerEmployee(scanner);
                    break;

                case 2:
                    loggedIn = employeeService.loginEmployee(scanner);
                    break;

                case 3:
                    if (loggedIn) {
                        customerService.addCustomer(scanner);
                    } else {
                        System.out.println("You need to log in first.");
                    }
                    break;

                case 4:
                    if (loggedIn) {
                        System.out.print("Enter SSN Number (long): ");
                        long ssn = scanner.nextLong();  // Changed to long
                        scanner.nextLine();  // Consume newline
                        customerService.viewCustomer(ssn);
                    } else {
                        System.out.println("You need to log in first.");
                    }
                    break;

                case 5:
                    if (loggedIn) {
                        System.out.print("Enter SSN Number (long): ");
                        long ssn = scanner.nextLong();  // Changed to long
                        scanner.nextLine();  // Consume newline
                        customerService.updateCustomer(scanner, ssn);
                    } else {
                        System.out.println("You need to log in first.");
                    }
                    break;

                case 6:
                    if (loggedIn) {
                        System.out.print("Enter SSN Number (long): ");
                        long ssn = scanner.nextLong();  // Changed to long
                        scanner.nextLine();  // Consume newline
                        customerService.deleteCustomer(ssn);
                    } else {
                        System.out.println("You need to log in first.");
                    }
                    break;

                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
	}

}
