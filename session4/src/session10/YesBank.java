package session10;

public class YesBank extends Bank {

	public void loan(){
		System.out.println("Yes Bank provides loan at 8%");
	}
	
	public String associatedTo(){
		return "Yes Bank";
	}
}
