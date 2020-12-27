package JavaBasics;

public class Array_twodimensional {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	 String x[][] = new String[4][4];
	 System.out.println("****Family Member Details*****");
	 System.out.println("Total Family Member Count:"+x.length);
	 System.out.println("Total Attributes Count:"+x[0].length);
	 System.out.println("******************************");
	 //1st Row
	 x[0][0]="Name: Nawaz";
	 x[0][1]="Age: 32";
	 x[0][2]="Gender: M";
	 x[0][3]="Relation: Husband";
	 
	 //2nd Row
	 x[1][0]="Name: Shabana";
	 x[1][1]="Age: 30";
	 x[1][2]="Gender: F";
	 x[1][3]="Relation: Wife";
	 
	//3rd Row
	 x[2][0]="Name: Zoeya";
	 x[2][1]="Age: 5";
	 x[2][2]="Gender: F";
	 x[2][3]="Relation: First Child";
	
	 //4th Row
	 x[3][0]="Name: Zaara";
	 x[3][1]="Age: 2";
	 x[3][2]="Gender: F";
	 x[3][3]="Relation: Second Child";
	 
	 	 
	 for(int row = 0;row<x.length;row++){
		 System.out.println("Family Member-"+(row+1)+" Details");
		 System.out.println("****************************");
		 for(int col = 0;col<x[0].length;col++){
			 System.out.println(x[row][col]);
		 }
		 System.out.println("****************************");
	 }
	 
	}

}
