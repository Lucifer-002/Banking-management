import java.util.*;
public class CustomerService {
	 private Map<Long, Customer> customerMap = new HashMap<>(); 
	 public void addCustomer(Scanner scanner) {
	        System.out.print("Enter SSN Number : ");
	        long ssn = scanner.nextLong();  // Changed to long
	        scanner.nextLine();  // Consume newline
	        System.out.print("Enter Name: ");
	        String name = scanner.nextLine();
	        System.out.print("Enter Email: ");
	        String email = scanner.nextLine();
	        System.out.print("Enter Address: ");
	        String address = scanner.nextLine();
	        System.out.print("Enter Contact Number: ");
	        String contactNumber = scanner.nextLine();
	        System.out.print("Enter Aadhar Number: ");
	        String aadhar = scanner.nextLine();
	        System.out.print("Enter PAN Number: ");
	        String pan = scanner.nextLine();
	        System.out.print("Enter Account Number: ");
	        String accountNumber = scanner.nextLine();

	        customerMap.put(ssn, new Customer(ssn, name, email, address, contactNumber, aadhar, pan, accountNumber));
	        System.out.println("Customer added successfully!");
	    }

	    public void viewCustomer(long ssn) {
	        Customer customer = customerMap.get(ssn);
	        if (customer != null) {
	            customer.displayCustomerDetails();
	        } else {
	            System.out.println("Customer data not present.");
	        }
	    }

	    public void updateCustomer(Scanner scanner, long ssn) {
	        Customer customer = customerMap.get(ssn);
	        if (customer != null) {
	            System.out.print("Enter Name: ");
	            String name = scanner.nextLine();
	            System.out.print("Enter Email: ");
	            String email = scanner.nextLine();
	            System.out.print("Enter Address: ");
	            String address = scanner.nextLine();
	            System.out.print("Enter Contact Number: ");
	            String contactNumber = scanner.nextLine();
	            System.out.print("Enter Aadhar Number: ");
	            String aadhar = scanner.nextLine();
	            System.out.print("Enter PAN Number: ");
	            String pan = scanner.nextLine();
	            System.out.print("Enter Account Number: ");
	            String accountNumber = scanner.nextLine();

	            customer.updateCustomer(name, email, address, contactNumber, aadhar, pan, accountNumber);
	            System.out.println("Customer updated successfully!");
	        } else {
	            System.out.println("Customer data not present.");
	        }
	    }

	    public void deleteCustomer(long ssn) {
	        if (customerMap.containsKey(ssn)) {
	            customerMap.remove(ssn);
	            System.out.println("Customer deleted successfully!");
	        } else {
	            System.out.println("Customer data not present.");
	        }
	    }

}
