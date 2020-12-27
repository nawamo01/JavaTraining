package MultipleInterfaceThreading;
/* 
 	1.Multiple Interface and Inheritance is called multi threading concept. 
	2.Java program implements and extends the methods using Interface and Inheritance.
	3.Interface is declaring the methods and it is not allowing to create body of methods. 
	4.The class will implements the interface in main method.
	5.It is mandatory for the class to use all methods from interface once implements done. 
*/

public interface USbank {
// These three methods should be used in class else Java will through the error.
public void credit();
public void debit();
public void transfermoney();
}
