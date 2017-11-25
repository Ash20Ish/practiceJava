package session10;

public class StateBank extends Bank{

	public void loan(){
		System.out.println("State Bank provides loan at 10%");
	}
	
	public void fixedDeposit(){
		System.out.println("State Bank provides 10% on your FD");
	}
}
