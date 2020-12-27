package JavaBasics;

public class IfElse_Condition {

	public static void main(String[] args) {
		
	int a = 300;
	int b = 200;
	int c = 100;
	
	if(a>b & a>c){
	System.out.println("A is greatest:"+a);
	}
	else if(b>c){
			System.out.println("B is greatest:"+b);
	}
	else{
			System.out.println("C is greatest:"+c);
		}
		
	System.out.println("********************************");
	int a1 = 20;
	int b1 = 30;
	int c1 = 20;
	
	if(a1==b1){							//== is a comparison operators |  = is a assigning operators
		System.out.println("A&B is equal");
	}
	else if(a1==c1){
		System.out.println("A&C is equal");
	}
	else{
		System.out.println("B&C is equal");
	}
	
	}

}
