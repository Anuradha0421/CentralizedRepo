package firstsession;

public class Student {

	int Rollno;
	int Age;
	public void method1()
	{
		System.out.println("welcome all");	
	}
	public void method2()
	{
		System.out.println("Automation is very easy");
	}
	public static void main(String[] args)
	{
	Student Deepak=new Student();
	Deepak.method1();
	Deepak.method2();
	Deepak.Rollno=22;
	Deepak.Age=18;
	
	System.out.println("Student Rollno is"+Deepak.Rollno);
	System.out.println("Student Age is"+Deepak.Age);
	
	}
	
}
