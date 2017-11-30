package session11;

public class Person {
	
	public void banksWith(Bank bnk){
		System.out.println("Person is banking with "+bnk.associatedTo());
		bnk.loan();
		bnk.deposit();
	}

}
