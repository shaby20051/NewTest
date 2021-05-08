package Construct;

public class Execute{


	public static void main(String[] args) {
		
		ClassA cla1=new ClassA();
		ClassA cla2= new ClassA("Shahab", 37);
		//ClassA clB= new ClassB ();
		
		cla1.ClassB("Professor Colony", 28);
		cla1.details();
		
		cla2.details();
		

	}

}
