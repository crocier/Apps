import java.util.ArrayList;
import java.util.List;

public class TestMain {
	public static void main(String[] args) {
		
		Company comp = new Company("Amazon");
		
		Customer cust1 = new Customer("1", "Abhi", "abhi123@gmail.com");
		Customer cust2 = new Customer("2", "Akash", "akash321@gmail.com");
		
		RegCustomer rg1 = new RegCustomer("3", "Sowmya", "sowmya@gmail.com", "10/01/2020");
		RegCustomer rg2 = new RegCustomer("4", "Sandhya", "sandhya@gmail.com", "20/05/2020");
		RegCustomer rg3 = new RegCustomer("5", "Sooraj", "sooraj@gmail.com", "25/11/2020");
		
		
		rg1.setMembership(MembershipFactory.getInstance().create("CLASSIC"));
		rg2.setMembership(MembershipFactory.getInstance().create("GOLD"));
		rg3.setMembership(MembershipFactory.getInstance().create("PREMIUM"));
		
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(cust1);
		customers.add(cust2);
		customers.add(rg1);
		customers.add(rg2);
		customers.add(rg3);
		
		//adding customers to company
		comp.setCustomers(customers);
		
		System.out.println("Company Name : " + comp.getName());
		
		
		List<Customer> cust = comp.getCustomers();
		
		for(Customer customer : cust) {
			if( customer instanceof RegCustomer) {
				RegCustomer rc = (RegCustomer) customer;
				System.out.println("Cust Id : " + rc.getCustId());
				System.out.println("Cust NAme: " + rc.getName());
				System.out.println("Cust Email : "+ rc.getEmail());
				System.out.println("Reg Date : " + rc.getDtReg());
				System.out.println("Type of Membership : " + rc.getMembership().getTypeOfMembership());
				System.out.println("======================");
			}
			else {
				System.out.println("Cust Id: " + customer.getCustId());
				System.out.println("Cust Name: " + customer.getName());
				System.out.println("============================");
			}
		}
		
		
		
		
		
		
		
		
	}

}
