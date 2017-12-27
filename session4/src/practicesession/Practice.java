package practicesession;

public class Practice {

	private static int temp;
	private static String str;
	private static int strLen = 0;
	
	//Method to Add all numbers in an Array
	public static int sumOfArray(int[] nums) 
	{
		for (int n : nums) 
		{
			temp = temp + n;
		}
		return temp;
	}
	
	//Method to print element with highest length in an Array
	public static String highLengthEleOfArray(String[] names) 
	{
		for (String n : names) 
		{
			if(n.length()>= strLen);
			str = n;
		}
		return str;
	}
	
	//Method to print elements which are greater than 10 and divisible by 5
		public static void eleGrtTenDivFivOfArray(int[] elements) 
		{
			for (int n : elements) 
			{
				if(n > 10 && (n%5 == 0)){
					System.out.println(n);
				}
				
			}
	
		}
		
		//Method to print 3D Array using enhanced for loop 
				public static void prntThreeDArray(int[][][]elements) 
				{
					for (int n[][] : elements) 
					{
						for(int j[] : n){
							
							for(int k : j){
								System.out.print(k+" ");
							}
							System.out.println("");
						}
						
						System.out.println("");
					}
			
				}
				
		//Create Student Array
				public static Student[] createStuArray(int numOfStudents){
					Student[] students = new Student[numOfStudents];
					for(int i = 0 ; i<students.length;i++){
						students[i]= new Student();
						students[i].setStuRollNo(i+1);
						students[i].setStuName("Student"+(i+1));
					}
					return students;
				}
				
				
	
				
		//Print Student Array
			public static void prntStudents(Student[]studs){
				for(Student s : studs){
					System.out.println(s);
				}
			}
	

}
