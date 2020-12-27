package OOPConceptPart1;

public class Car {
	
	//Class Variables
	int mod;
	int wheel;
	
	public static void main(String[] args) {
	/* Car = Class 
	 * new Car() - Object
	 * a,b,c - Object reference Variables
	 */
	
	Car a = new Car();
	Car b = new Car();
	Car c = new Car();
	
	a.mod = 2015;
	a.wheel= 4;
	
	b.mod = 2016;
	b.wheel = 4;
	
	c.mod = 2017;
	c.wheel = 4;
	
	System.out.println("Before Shifting the values");
	System.out.println(a.mod);
	System.out.println(a.wheel);
	System.out.println(b.mod);
	System.out.println(b.wheel);
	System.out.println(c.mod);
	System.out.println(c.wheel);
	
	//Object reference variable shifting methods
	a=b;
	b=c;
	c=a;
	
	System.out.println("After Shifting the values");
	a.mod = 2018;
	System.out.println(a.mod); 	//The actual a value will be printed on console "2018"
	c.mod = 2019;
	System.out.println(a.mod);	//c values assigned to a "2019"	

	}

}
