package OOPConceptPart1;

public class FunctionsInJava {

	//Main() Method - Starting point of execution in Java
	// Void - The program will not return any values
	// without Void - The program will return some values
	// Main Method is void, will never returns a value
	public static void main(String[] args) {
		FunctionsInJava obj = new FunctionsInJava();
		// One object will be created, obj is an object reference variable and it is referring the object "FunctionsInJava()"
		// After creating the object, the copy of all non static methods will be given to this object 
		
		//Non Static Method 1
		obj.test();
		
		//Non Static Method 2
		int l = obj.pqr();
		System.out.println(l);
		
		//Non Static Method 3
		String s1 = obj.qa();
		System.out.println(s1);
		
		//Non Static Method 4
		int div = obj.divison(30,10);
		System.out.println(div);

	}
	public void test(){			//Method 1 - no input from main method and no output value
		System.out.println("**********************");
		System.out.println("test method");

	}
	
	public int pqr(){		
		/* Method 2 - no input from main method and but some output value	
		   	1) void should not be used due to return variable 
			2) Need to use the data type of return variable instead of void
		 */
	System.out.println("**********************");
	System.out.println("pqr Method");
	System.out.println("**********************");
		int a = 10;
		int b = 20;
		int c= a+b;
		return c;
	
	}
	public String qa(){			//Method 3 - no input from main method and some output value
		System.out.println("**********************");
		System.out.println("qa method");
		System.out.println("**********************");
		String s = "Selenium";
		return s;
		}
	public int divison(int x,int y){	//Method 4 - some input, some output | x,y - input parameters/arguments
		System.out.println("**********************");
		System.out.println("division method");
		System.out.println("**********************");
		int d = x/y;
		return d;
	}
	
	}