package Abstraction;

public class Execute extends Abstract {

	String str;
	
	void run(String str) {
		System.out.println(str);
		
	}
	
	@Override
	void run() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		
		Execute exe = new Execute();
		exe.nonabstract();
		exe.run("Vehicle running");

	}




}
