package session15;

public class ArrayDemoRunner {
	
	public static void main(String []args){
		int [] num = {1,50,4,70,6};
		String [] names = {"Ashish","Mitula","tisha","priyanshi"};
		System.out.println("Array before bubble sorting ascending");
		for(int i : num){
			System.out.println(i);
		}
		
		ArraySort arrSort = new ArraySort();
		arrSort.sortIntArrayAsc(num);
		
		System.out.println("*****Array after bubble sorting ascending*****");
		for(int i : num){
			System.out.println(i);
		}
		
		arrSort.sortIntArrayDsc(num);
		
		System.out.println("*****Array after bubble sorting descending*****");
		for(int i : num){
			System.out.println(i);
		}
		
		arrSort.sortStrArrayAsc(names);
		System.out.println("*****String Array after bubble sorting Ascending*****");
		for(String s : names){
			System.out.println(s);
		}
		
		arrSort.sortStrArrayDsc(names);
		System.out.println("*****String Array after bubble sorting Descending*****");
		for(String s : names){
			System.out.println(s);
		}
		
	}
	
	

}
