package JavaBasics;

public class loops {

	/* Public Static main method - starting/execution point of program	
	 */
	
	public static void main(String[] args) {
		// Two types of loops While & For 
		// While loop Dis-advantange - while loop will be infinite loop if incremental or decremental value is not given (i++ or i--)
		
		
		System.out.println("*********while Loop - Incremental***********");
		int i =1;
		while(i<=10){
		System.out.println(i);
		i=i+1; 						// i =i+1 & i++ both are same
		}
		
		System.out.println("*********while Loop - Decremental***********");
		int j=10;
		while(j>=0){
		System.out.println(j);
		j--;
		}
	
		System.out.println("*********For Loop - Incremental***********");
		for(int k=-10;k<=10;k++){
		System.out.println(k);
		}
		
		System.out.println("*********For Loop - Decremental***********");
		for(int l=10;l>=-10;l--){
		System.out.println(l);
		}
		
		System.out.println("******************************************");
	}

}
