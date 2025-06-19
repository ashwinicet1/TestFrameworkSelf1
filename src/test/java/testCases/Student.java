package testCases;

public class Student {
	
	String studentname;// class variables
	int studentid;
	

	//methods
	
	void show()// display is method name
	{
		System.out.println(studentname);
		System.out.println(studentid);
	}
	
	
	int methodreturn()
	{
	
		return studentid;
		
		
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1=new Student();
		
		student1.studentname="Ashok";
		
		student1.studentid=101;
		
		
		//student1.show();
		
		//String name=student1.methodreturn();
		
		
		//System.out.println(name);
		
		Student student2=new Student();
		student2.studentname="Manju";
		student2.studentid=102;
		
		int id=student2.methodreturn();
		
		System.out.println(id);
		
		
		//student2.show();
		
		/*
		Student student2=new Student();
		
		student2.studentname="Manju";
		student2.studentid=102;
		
		Student student3=new Student();
		
		student3.studentname="Mani";
		student3.studentid=103;
		
		
		System.out.println(student1.studentname);
		System.out.println(student1.studentid);
		
		*/
	}

}
