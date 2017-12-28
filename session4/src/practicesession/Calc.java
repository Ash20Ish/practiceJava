package practicesession;

public interface Calc {
	
	public int add(int a, int b);
	
	default int sub (int a, int b){
		return a-b;
	}
	
	default int mul (int a, int b){
		return a*b;
	}

}
