package JavaBasics;

public class DataTypes {

	/* 	Public Static main method - starting/execution point of program	
	  	Java project should be start with Project Name -> Package Name -> Class Name
	 	Run/Compile shortcut ctrl+F11
		Console means Output
	 */
	
		public static void main(String[] args) {
	
		// Important Notes
		// Data type name starts with small letter
		// Class name should start with Capital letter
		// Primitive data types are int, double, char, boolean
		// String is a class not data type
		// Object is a class (contain universal data type) but you can use it only in array
		
		System.out.println("**********Integer**********");		//shortcut type "syso" + Ctrl + space
		int i=30;
		int j=20;
		System.out.println(i);
		System.out.println(j);
		
		System.out.println("**********Double**********");
		double d1 = 13.55;
		double d2 = 45.88;
		double d3 = 100;			//converts value into 100.00
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
				
		System.out.println("**********Character**********");
		char c1 = 'A';
		char c2 = 'B';				// char - single letter with small quotes
		System.out.println(c1);
		System.out.println(c2);
			
		System.out.println("**********Boolean**********"); 
		boolean b1 = true; 			//true/false value should be small letter
		boolean b2 = false;
		System.out.println(b1);
		System.out.println(b2);
		
		System.out.println("**********String**********");
		String s="Mohamed Nawaz";
		String s1="This is my first java code";
		System.out.println("My Name is: "+s);
		System.out.println(s1);
	
		System.out.println("**************************");
		
	}

}
