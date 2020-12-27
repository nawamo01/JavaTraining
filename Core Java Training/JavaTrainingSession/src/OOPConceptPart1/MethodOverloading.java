package OOPConceptPart1;

public class MethodOverloading {

	/*
	 1) Method Overloading - When method name is same with different arguments/input parameters/different data types in a same class
	 2) Main Method is also can be overload
	 3) A method cannot be created inside a method
	 4) Duplicate Method - i.e. Same method name with same number of arguments or input parameters/datatypes in a same class
	 5) Duplicate Method is not allowed in Java
	 */
	
	public static void main(String[] args) {
	MethodOverloading obj = new MethodOverloading();
	obj.sum();
	int m = obj.sum(10);
	System.out.println(m);
	double n = obj.sum(14.33);
	System.out.println(n);
	
	int o = obj.sum(10,20);
	System.out.println(o);
	}
	
	public static void main(int p){
		System.out.println("Main method is also can be overload");
	}
	public void sum(){	//Method with Zero input parameter
		System.out.println("Sum Method - Zero Input Parameter");
	}

	public int sum(int x){ //Method with One input parameter
		System.out.println("Sum Method - one Input Parameter");
		int i = x+1;
		return i;
	}
	public double sum(double y){	//Duplicate method with One input parameter in different data types
		System.out.println("Sum Method - one Input Parameter with different data types"); 
		double d = y+1;
		return d;
	}
	
	public int sum(int a, int b){
		
			System.out.println("Sum Method - two Input Parameter");
			int c= a+b;
			return c;	
		
	}

}
