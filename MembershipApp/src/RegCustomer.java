
public class RegCustomer extends Customer {
	
	private String dtReg;
	private Membership membership;

	public RegCustomer(String custId, String name, String email, String dtReg, Membership membership) {
		super(custId, name, email);
		this.dtReg = dtReg;
		this.membership = membership;
	}
	
	public RegCustomer(String custId, String name, String email, String dtReg) {
		super(custId, name, email);
		this.dtReg = dtReg;
	}

	public String getDtReg() {
		return dtReg;
	}

	public void setDtReg(String dtReg) {
		this.dtReg = dtReg;
	}

	public Membership getMembership() {
		return membership;
	}

	public void setMembership(Membership membership) {
		this.membership = membership;
	}

	
}
