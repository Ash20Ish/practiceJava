package session11;

public class AbstractRunner {

	public static void main(String[] args) {
		System.out.println("This runner class uses abstract bank class and abstract methods of bank class");
		StateBank sbi = new StateBank();
		System.out.println("Object of child and ref of child class");
		System.out.println("----------------------------------------------------------");
		sbi.deposit();
		sbi.fixedDeposit();
		sbi.loan();
		System.out.println("----------------------------------------------------------");
		System.out.println("Object of child and ref of parent class");
		System.out.println("----------------------------------------------------------");
		Bank bbg = new StateBank();
		bbg.loan();
		bbg.deposit();
		System.out.println("----------------------------------------------------------");
		System.out.println("Object of child and ref of parent class");
		System.out.println("----------------------------------------------------------");
		Bank ysBank = new YesBank();
		ysBank.deposit();
		ysBank.loan();
		System.out.println("----------------------------------------------------------");
		System.out.println("Object of child Statebank and ref of parent bank class provided as argument to person class");
		System.out.println("----------------------------------------------------------");
		
		Person p1 = new  Person();
		p1.banksWith(bbg);
		
		System.out.println("----------------------------------------------------------");
		System.out.println("Object of child Yesbank and ref of parent bank class provided as argument to person class");
		System.out.println("----------------------------------------------------------");
		
		Person p2 = new  Person();
		p2.banksWith(ysBank);
		
	}

}
