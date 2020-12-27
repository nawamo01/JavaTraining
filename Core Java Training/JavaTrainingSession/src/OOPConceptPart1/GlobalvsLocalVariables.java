package OOPConceptPart1;

public class GlobalvsLocalVariables {

	/**
	 1) Global variables can be used in main method using object reference variable
	 2) Global Variables can be directly used in non static methods without object reference variable
	 */
	
	//Global Variables
	String name = "Tom";
	int age = 32;
	
	public static void main(String[] args) {
	
		// how to create object and object reference variable - using class name
		// class name - GlobalvsLocalVariables
		// object reference variables - obj
		// object - GlobalvsLocalVariables()
		
		String address ="London";
		GlobalvsLocalVariables obj = new GlobalvsLocalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(address);
		
		
		obj.method();		// Need to call non static method using object reference variable
		
	}

	public void method(){
		char gender = 'M';
		
		System.out.println("*******************************************");
		System.out.println("Global/Local variables in Non Static Method");
		System.out.println("*******************************************");
		System.out.println(name); 	// Global Variables can be directly used in non static methods without object reference variable
		System.out.println(gender);
		System.out.println(age); 	// Global Variables 
	}
	
}
