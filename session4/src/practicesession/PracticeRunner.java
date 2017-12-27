package practicesession;

public class PracticeRunner {

	public static void main(String[] args) {
		int[] nums = {12,32,33,45,58,3,5,6,8,10,55};
		String[] names = {"ashish","mitula","tisha","priyanshi","prabhakar"};
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
		
		
		
		

	}

}
