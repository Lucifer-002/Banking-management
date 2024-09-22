
public class Customer {
	private long ssnNumber;  // Changed to long
    private String name;
    private String email;
    private String address;
    private String contactNumber;
    private String aadharNumber;
    private String panNumber;
    private String accountNumber;
	public Customer(long ssnNumber, String name, String email, String address, String contactNumber,
			String aadharNumber, String panNumber, String accountNumber) {
		super();
		this.ssnNumber = ssnNumber;
		this.name = name;
		this.email = email;
		this.address = address;
		this.contactNumber = contactNumber;
		this.aadharNumber = aadharNumber;
		this.panNumber = panNumber;
		this.accountNumber = accountNumber;
	}
	public long getSsnNumber() {
		return ssnNumber;
	}
	public void setSsnNumber(long ssnNumber) {
		this.ssnNumber = ssnNumber;
	}
	public void updateCustomer(String name, String email, String address, String contactNumber, String aadharNumber, String panNumber, String accountNumber) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.contactNumber = contactNumber;
        this.aadharNumber = aadharNumber;
        this.panNumber = panNumber;
        this.accountNumber = accountNumber;
    }

    public void displayCustomerDetails() {
        System.out.println("SSN: " + ssnNumber);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Aadhar Number: " + aadharNumber);
        System.out.println("PAN Number: " + panNumber);
        System.out.println("Account Number: " + accountNumber);
    }
}
