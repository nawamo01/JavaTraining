package InheritanceMethodOverridingPolymorphism;

public class Testcar{

	/*Important Notes:
	 1. Vechile class is Grand parent  | Car Class is Parent Class | BMW is child class
	 2. Method Overriding - When same method is present in parent and child class with same name and same number of arguments,
	    it is called Method Overriding. Java will always call overridden methods from child class.
	 3. Polymorphism -  # The ability of an object from child or parent class to take on many forms 
	 					# Static (compile time) polymorphism    - The child class object reference used to refer the child/parent/super class objects
	 					# Dynamic (run time polymorphism		- The parent class object reference used to refer the child class object. 
	 					# Child class inheriting the methods from parent class
	 4. Inheritance  - Child class acquires all the properties from parent class is called inheritance.
	 */
	public static void main(String[] args) {
		
		//  Static Polymorphism -    Compile time Polymorphism
		
		BMW b = new BMW();
		b.start();			//calling BMW class method using object reference
		b.stop();			//calling BMW class method using object reference
		b.theftkey();		//calling BMW class method using object reference
		b.engine();			//calling Vechile class (grand parent) method
		
	System.out.println( "**************");
	
		car c = new car();
		c.start();			//Calling car class method using object reference
		c.stop();
		c.refuel();
		
	System.out.println( "**************");

	//Top Casting
		
		car c1 = new BMW();	//child class object can be referred by parent class reference. it's called Dynamic or run time Polymorphism
	
		c1.start();			//child class method can be referred by parent class reference variable if both class method name is same
		c1.stop();
		c1.refuel();
		
		//c1.theftkey();	//child class method cannot be referred by parent class if both classes method name is different.
		
		System.out.println( "**************");
		
	//Down Casting
		BMW b1 = (BMW)new car(); //ClassCastException
								 //Down casting is not allowed in Java
		
		
	}

}
