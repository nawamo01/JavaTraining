package InheritanceMethodOverridingPolymorphism;

public class BMW extends car{

	public void start(){
		System.out.println("BMW--Start");	//overridden method (since the same method is present in car (parent class)
	}
	public void stop(){
		System.out.println("BMW--stop");	//overridden method (since the same method is present in car (parent class)
	}
	public void theftkey(){
		System.out.println("BMW--theftkey"); // new method 
	}
}
