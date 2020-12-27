
public class StringConcatenation {

	/**
	 1) + : is a concatenation operator
	 2) system.out.println() - is used to print on the console(output) with a new line
	 3) system.out.print() - is used to print on the console(output) in the same line	 */
	public static void main(String[] args) {
		
		int a = 100;
		int b = 100;
		double c = 14.33;
		double d = 120.88;
		String x = "Hello";
		String y = "World";
		
		System.out.println(a+b);
		System.out.println(c+d);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(x+a+y+b);
		System.out.println(a+x+b+y);
		System.out.println(x+c+y+d);
		System.out.println(x+y+(c+d));
		
	}

}
