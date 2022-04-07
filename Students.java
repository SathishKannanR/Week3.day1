package Week3.day1;

public class Students {
	
	public void getStudentInfo(int id)
	{
		System.out.println("Student Id is:"+id);
	}
	public void getStudentInfo(int id, String Name)
	{
		System.out.println("Student Id is:" +id);
		System.out.println("Student Name is:" +Name);
	}
	public void getStudentInfo(String email, String phonenumber)
	{
		System.out.println("Student Id is:" +email);
		System.out.println("Student Id is:" +phonenumber);
	}

	public static void main(String[] args) {
		
		Students s= new Students();
		s.getStudentInfo(32);
		s.getStudentInfo(32, "Sathish");
		s.getStudentInfo("sathish@gmail.com", "9876543210");
		
	

	}

}
