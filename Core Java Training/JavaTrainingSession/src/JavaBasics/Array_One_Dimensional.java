package JavaBasics;


public class Array_One_Dimensional {

	/*
	 1. Array - to store similar data type values to array variable
	 2. Lowest array index is 0
	 3. Highest array index is n-1   (n is a size of array)
	 
	 Disadvantages of array
	 1. Size is fixed - static Array - To overcome this problem - use collections - ArrayList, HashTable - use Dynamic Array
	 2. Stores only similar data types - To overcome this problem - use Object array
	 
	  */
	
	public static void main(String[] args) {
	int x[]= new int[5];
	x[0]=10;
	x[1]=20;
	x[2]=30;
	x[3]=40;
	x[4]=50;
	
	for(int i =0; i<x.length; i++){
		System.out.println("An Integer values is: "+x[i]);
	}
System.out.println("******************************************");

	double d[] = new double[2];
	d[0]= 25.66;
	d[1] =52.87;
	//d[2]=18.23; //ArrayIndexOutOfBoundsException   - error exception
	System.out.println("The Double Value is: "+d[1]);


System.out.println("******************************************");

	char c[] = new char[2];
	c[0]='M';
	c[1]='F';
	System.out.println("The Gender is: "+c[0]);
	
System.out.println("******************************************");
	
	Object ob[] = new Object[5];
	ob[0]= Integer.valueOf(12);
	ob[1]= "Tomasz Sablazki";
	ob[2]= Character.valueOf('M');
	ob[3]= Double.valueOf(4356983.33);
	ob[4]= "No.8, 1st Floor, Newyork";
	
	for(int y =0; y<ob.length;y++){
		System.out.println(ob[y]);
	}
	System.out.println("******************************************");
	}

}
