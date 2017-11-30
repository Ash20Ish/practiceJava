package session11;

public abstract class Bank {

	public abstract void loan();
	public abstract String associatedTo();
	
	public void deposit(){
		System.out.println("This is the deposit protocol from bank");
	}
}
