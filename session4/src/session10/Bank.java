package session10;

public class Bank {

	public void loan(){
		System.out.println("Bank provides loan at 0%");
	}
	
	public void deposit(){
		System.out.println("This is the deposit protocol from bank");
	}
	
	public String associatedTo(){
		return "Bank";
	}
}
