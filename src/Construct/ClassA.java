package Construct;

public class ClassA {
	
	String name;
	int age ;

	public ClassA(String name , int age) {
		
		this.age =age;
		this.name =name;
		System.out.println("Name = "+ name);
		System.out.println("Age = "+ age);
		
	}

	public void details() {
		System.out.println(name+ age);
	}
}
