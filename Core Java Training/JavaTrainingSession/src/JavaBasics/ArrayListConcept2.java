package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept2 {
public static int k;

	public static void main(String[] args) {
		/* Array List Concept
		 * 1. ArrayList Integer
		 * 2. ArratList Double
		 * 3. ArrayList String
		 * 4. ArrayList Combined Datatypes
		 */
		
		// 1.Array List for Integer values
		System.out.println("**********");
		ArrayList<Integer> Int = new ArrayList<Integer>();
		Int.add(10);
		Int.add(20);
		Int.add(30);
		System.out.println("Integer count is : " + Int.size());
		Int.add(40);
		Int.add(50);
		System.out.println("Integer count is : " + Int.size());

		//2. Array List for Double values
		System.out.println("*************");
		ArrayList<Double> Db = new ArrayList<Double>();
		Db.add(12.33);
		Db.add(15.88);
		Db.add(85.45);
		System.out.println("Double size is:" + Db.size());
		for (int i = 0; i < Db.size(); i++) {
			System.out.println("Double Value is: " + Db.get(i));
		}

		//3. Array List for String values
		System.out.println("***************");
		ArrayList<String> Str = new ArrayList<String>();
		Str.add("Nawaz");
		Str.add("Tom");
		Str.add("Michal");
		Str.add("John");
		System.out.println("String Size:" + Str.size());
		int j = 0;
		while (j < Str.size()) {
			System.out.println("The String Value is:" + Str.get(j));
			j++;
		}
		Str.remove(3);
		System.out.println("Afer removal String Size:" + Str.size());

		Str.clear();
		System.out.println("Afer Clean String Size:" + Str.size());

		// 4.Array List for Universal data types
		System.out.println("*************************");
		ArrayList obj = new ArrayList();
		obj.add("Tom");
		obj.add(32);
		obj.add('M');
		obj.add(37542.80);
		System.out.println("The Employee Name: "+obj.get(0));
		System.out.println("Age: "+obj.get(1));
		System.out.println("Gender: "+obj.get(2));
		System.out.println("Monthly Income: "+obj.get(3));
		System.out.println("*************************");
		
		for(k=0;k<obj.size();k++){				// k is a global variable so datatype declaration already declared
			System.out.println(obj.get(k));
		}
		
		}
}
