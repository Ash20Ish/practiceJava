package practicesession;

public class PracticeRunner {

	public static void main(String[] args) {
		int[] nums = {12,32,33,45,58,3,5,6,8,10,55};
		String[] names = {"ashish","mitula","tisha","priyanshi","prabhakar","ashishpatel"};
		int[][][] elements = {{{12,1,3},{31,41,23}},{{34,54,67},{45,52,78}},{{67,89,94},{77,34,86}}};
				
		int total = Practice.sumOfArray(nums);
		System.out.println("Sum of the Array : "+total);
		System.out.println("***********************************************");
		String highLen = Practice.highLengthEleOfArray(names);
		System.out.println("Element with the highest length : "+highLen);
		System.out.println("***********************************************");
		System.out.println("Elements greater than ten & divisible by five");
		Practice.eleGrtTenDivFivOfArray(nums);
		System.out.println("***********************************************");
		System.out.println("Printing 3D Array");
		System.out.println("***********************************************");
		Practice.prntThreeDArray(elements);
		System.out.println("***********************************************");
		System.out.println("Create Student Array for desired number of students");
		Student[] studs = Practice.createStuArray(5);
		System.out.println("***********************************************");
		System.out.println("Print Student Array using enhanced for loop");
		System.out.println("***********************************************");
		Practice.prntStudents(studs);
		System.out.println("Over loaded add methods to add integers");
		System.out.println("***********************************************");
		System.out.println("Sum of Two integers : " + Practice.add(4,5));
		System.out.println("Sum of Three integers : " + Practice.add(4,5,6));
		System.out.println("Sum of Four integers : " + Practice.add(4,5,6,7));
		System.out.println("Area of a Circle");
		System.out.println("***********************************************");
		Practice.areaCircle(3);
		System.out.println("***********************************************");
		System.out.println("Ref of Interface Calc and Object of Implementing Calculator Class");
		System.out.println("***********************************************");
		Calc cal = new Calculator();
		System.out.println("Add Method from Calculator Class : "+cal.add(4,3));
		System.out.println("Default Mul Method from Calc Interface : "+cal.mul(4,3));
		System.out.println("Default Sub method from Calc Interface : "+cal.sub(4,3));
	}

}
