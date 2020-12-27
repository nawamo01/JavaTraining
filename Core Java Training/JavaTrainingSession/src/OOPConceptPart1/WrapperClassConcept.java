package OOPConceptPart1;

public class WrapperClassConcept {

	/* Wrapper Class means data conversion from String to Integer, Double and Boolean, vice versa
	 * String to Character data type will not allowed in wrapper class
	 */
	public static void main(String[] args) {
			
		
		//Data Conversion: String to Integer
		String s1 = "100";
		System.out.println(s1+20);			//String concatenation will be performed. result is 10020
		int i = Integer.parseInt(s1);
		System.out.println(i+20);			//result is 120
		
		//Data conversion: String to Double
		String s2 = "14.33";
		double d = Double.parseDouble(s2);
		System.out.println(d+20);			//result is 34.33
		
		//Data conversion: String to boolean
		String s3 = "true";
		boolean b = Boolean.parseBoolean(s3);
		System.out.println(b);				//result is true (boolean format)
		
		
		//Data conversion: Int to String
		int i1 = 200;
		System.out.println(i1+200);			//result is 400
		String s4 = String.valueOf(i1);
		System.out.println(s4+200);			//result is 200200 (string concatenation
		
		//can i convert alphanumeric string value to integer? No - java.lang.NumberformatException
		
		String s5 = "100A";
		int i2 = Integer.parseInt(s5);
		System.out.println(i2);
		
	}

}
