package practicesession;

public class Student {
	private int stuRollNo;
	private String stuName;
	
	public int getStuRollNo() {
		return stuRollNo;
	}
	public void setStuRollNo(int stuRollNo) {
		this.stuRollNo = stuRollNo;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	
	@Override
	public String toString() {
		return "Student [stuRollNo=" + stuRollNo + ", stuName=" + stuName + "]";
	}
	
}
