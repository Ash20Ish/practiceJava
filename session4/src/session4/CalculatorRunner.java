package session4;

/*
 * This class will execute all calculating methods of calculator class
 */

public class CalculatorRunner {

	public static void main(String[] args) {
		int i = 200;
		int j = 230;

		Calculator calc = new Calculator();
		int result = calc.add(i, j);
		int result1 = calc.substract(i, j);
		int result2 = calc.multiply(i, j);
		double result3 = calc.divide(i, j);
		int result4 = calc.mod(i, j);
		System.out.println("Addition of two integer variables "+i+" and "+ j+" = " + result);
		System.out.println("Substraction of two integer variables "+i+" and "+ j+" = " + result1);
		System.out.println("Multiplication of two integer variables "+i+" and "+ j+" = "+ result2);
		System.out.println("Division of two integer variables "+i+" and "+ j+" = " + result3);
		System.out.println("MOD which is remainder of division between two integer variables "+i+" and "+ j+" = "+result4);

	}

}
