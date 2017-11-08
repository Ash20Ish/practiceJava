package session5;

public class CompareValue {
	int h;

	public void great(int num1, int num2, int num3, int num4, int num5) {
		if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
			System.out.println(num1 + " is greatest");
		} else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
			System.out.println(num2 + " is greatest");
		} else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
			System.out.println(num3 + " is greatest");
		} else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {
			System.out.println(num4 + " is greatest");
		} else {
			System.out.println(num5 + " is greatest");
		}
	}

	public void low(int num1, int num2, int num3, int num4, int num5) {
		if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5) {
			System.out.println(num1 + " is lowset");
		} else if (num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5) {
			System.out.println(num2 + " is lowest");
		} else if (num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5) {
			System.out.println(num3 + " is lowest");
		} else if (num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5) {
			System.out.println(num4 + " is lowest");
		} else {
			System.out.println(num5 + " is lowest");
		}
	}

	public void maxValue(int[] nums) {
		for (int z = 0; z < nums.length; z++) {
			if (h < nums[z]) {
				h = nums[z];
			}
		}
		System.out.println("Maximum Value is " + h);
	}

	public void minValue(int[] nums) {
		for (int z = 0; z < nums.length; z++) {
			if (h > nums[z]) {
				h = nums[z];
			}
		}
		System.out.println("Minimum Value is " + h);
	}

}
