import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MembershipFactory {
	
	private Map<String, Membership> pool = new HashMap<String, Membership>();
	private static MembershipFactory mem = new MembershipFactory();
	
	private MembershipFactory() {
		pool.put("CLASSIC", new Membership("CLASSIC", 5.0, 20000));
		pool.put("GOLD", new Membership("GOLD", 10.0, 50000));
		pool.put("PREMIUM", new Membership("PREMIUM", 20.0, 100000));
	}
	
	public Membership createMembership(String typeOfMembership, double discount, double fees) {
		Membership mem = new Membership();
		mem.setTypeOfMembership(typeOfMembership);
		mem.setDiscount(discount);
		mem.setFees(fees);
		return mem;	
	}
	
	public Membership create(String typeOfMembership) { //if key given is exits then return membership value wrt Key given
		Set<String> keys = pool.keySet(); //elements of membership is stored in keys
		for(String s : keys) {
			if(s.equals(typeOfMembership)) {
				return pool.get(s); // return membership value
			}
		}
		return null;
		
	}
	
	public static MembershipFactory getInstance() {
		return mem;
	}
	
	

}
