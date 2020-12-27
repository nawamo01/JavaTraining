package MultipleInterfaceThreading;

public class HSBCbank implements USbank, Brazilbank {

	/*
	 1. This HSBCbank class should use all the methods from USbank & Brazilbank interface since class implements those interface
	 2. Main method not required since we will only use Interface methods in this class	
	*/
	
		//USbank methods
		public void credit(){
			System.out.println("USbank--Credit");
		}
		public void debit(){
			System.out.println("USbank--Debit");
		}
		public void transfermoney(){
			System.out.println("USbank--Transfer Money");
		}

		//Brazilbank methods
		public void netbanking(){
			System.out.println("Brazilbank--Netbanking");
		}
		public void phonebanking(){
			System.out.println("Brazilbank--Phonebanking");
		}
		
		//HSBC class own methods
		public void fingerprintlogin(){
			System.out.println("HSBC--Finger Print login");
		}
	
	
}
