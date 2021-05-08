package Construct;

public class ClassA {
	
	String Addre;
	int roll;
	String name;
	int age ;

	public ClassA(String name , int age) {
		
		this.age =age;
		this.name =name;
				
	}
	
	public void ClassB (String Address, int rollno)
	{
		Addre = Address;
		roll = rollno;
		
	}
	public void details() {
		System.out.println("Name is "+name+" Age is "+ age);
		System.out.println("Address is "+Addre + "Roll no is "+roll);
	}
}
