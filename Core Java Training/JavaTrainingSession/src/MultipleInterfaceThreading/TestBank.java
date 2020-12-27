package MultipleInterfaceThreading;

public class TestBank {

	/**
	 1. The main method is required in this class since we will compile all the methods from this class
	 */
	public static void main(String[] args) {
		
		//Static Polymorphism - Parent class object can be referred by child class object reference. -- compile time polymorphism
		
		HSBCbank hs = new HSBCbank();
		hs.credit();
		hs.debit();
		hs.transfermoney();
		hs.netbanking();
		hs.phonebanking();
		hs.fingerprintlogin();
		System.out.println("**************");
		
		//Dynamic Polymorphism - Child class can be referred by parent class object reference variable -- Run time polymorphism
		//1. HSBCbank (child)referred by Usbank (Parent)
		USbank usb = new HSBCbank();
		usb.credit();
		usb.debit();
		usb.transfermoney();
		
		//The child class own method cannot be referred by parent class object variable reference. Only overridden methods can be referred.
		//usb.fingerprintlogin();  		Error: The method fingerprintlogin() is undefined for the type USbank
		System.out.println("***************");
		
		//2. HSBCbank (Child) referred by Brazilbank  (Parent)
		Brazilbank bb = new HSBCbank();
		bb.netbanking();
		bb.phonebanking();
		System.out.println("****************");
	}

}
