package OOPConceptPart1;

public class StaticAndNonStaticConcept {

	/**
	 * @param args
	 */
	
	//Global variables
	 String name =  "Tom"; 	//Global non  static variable
	 static  int age = 25;	//Global static variable
	 
	 
	public static void main(String[] args) {
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		
		System.out.println(obj.name); 	// Non static global variable can be used through object reference variable
		System.out.println(age);		// Static global variable can be used directly
		
		obj.nonstaticsum();				//Non Static sum method calling through object reference variable
	
		// static way of calling static methods
		staticsum(10);					//1. Static Sum method calling directly 
			
		StaticAndNonStaticConcept.staticsum(20);	//2. Static Sum method calling through class name
		
		// can i access static method using object reference variable? yes
		obj.staticsum(20);	// but Java will give warning message as "static method has to be accessed in static way (either directly or through class name"
		
	}
	
	public void nonstaticsum(){
		System.out.println("non static sum method");
		System.out.println("Age is:"+age);	// Static global variable can be used directly in non static methods
	}
	public static void staticsum(int  x){
		System.out.println("Static sum method");
		System.out.println(x);
		System.out.println(age);			// Static global variable can be used directly in static methods
	}
	
}
