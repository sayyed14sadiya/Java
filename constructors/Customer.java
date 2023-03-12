package constructors;

class Customer1 {
public long customerId;
public String customerName;
public long contactNumber;
public String address;

public Customer1(String customerName,long contactNumber,String address) {
	this.customerName=customerName;
	this.contactNumber=contactNumber;
	this.address=address;
}
public void displayCustomerDetails() {
	System.out.println("Displaying customer details");
	System.out.println("Customer Id : "+customerId);
	System.out.println("Customer Name : "+customerName);
	System.out.println("Customer Number :"+contactNumber);
	System.out.println("Address : "+address);
	
}
}
public class Customer{
	public static void main(String[] args) {
		Customer1 obj=new Customer1("Jacob", 453628543,"13th down street,New York");
		obj.displayCustomerDetails();
	}
}
