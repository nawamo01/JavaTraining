package JavaBasics;

import java.util.ArrayList;		//import java collections from library
	
public class ArrayListConcept {

	/*
	 ArrayList - dynamic array. The size of an array is dynamically updated based on an input.
	  
	 */
	public static void main(String[] args) {
		
		//Declare Arraylist input is only double values 
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(100);
		ar.add(200);
		ar.add(300);
		System.out.println(ar.size());
		ar.add(500);
		System.out.println(ar.size());
		
		//Declare Arraylist input is only double values
		ArrayList<Double> ar1 = new ArrayList<Double>();
		ar1.add(12.33);
		ar1.add(56.88);
		System.out.println(ar1.size());
		
		//get specified values from arraylist ar and ar1
		System.out.println(ar.get(3));
		System.out.println(ar1.get(1));
		System.out.println("****************");
		
		//get all values using for loop
		for(int i =0; i<ar.size();i++){
			System.out.println(ar.get(i));
		}
	System.out.println("******************");
	
	
	 //declare all data types in same Array list
	ArrayList ar3 = new ArrayList();
	ar3.add("tom");
	ar3.add(200);
	ar3.add(14.33);
	ar3.add('M');
	ar3.add(true);
	
	for(int j=0; j<ar3.size();j++){
		System.out.println(ar3.get(j));
	}
	}

}
