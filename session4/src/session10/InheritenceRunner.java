package session10;

public class InheritenceRunner {

	public static void main(String[] args) {
		StateBank sbi = new StateBank();
		System.out.println("Object of child and ref of child class");
		System.out.println("----------------------------------------------------------");
		sbi.deposit();
		sbi.fixedDeposit();
		sbi.loan();
		System.out.println("----------------------------------------------------------");
		System.out.println("Object of parent and ref of parent class");
		System.out.println("----------------------------------------------------------");
		Bank bb = new Bank();
		bb.deposit();
		bb.loan();
		System.out.println("----------------------------------------------------------");
		System.out.println("Object of child and ref of parent class");
		System.out.println("----------------------------------------------------------");
		Bank bbg = new StateBank();
		bbg.loan();
		bbg.deposit();
		
	}

}
