package Method;

import javax.print.attribute.standard.JobMessageFromOperator;

public class Demo1 {
	
         // static method call from same class 
	
	public static void main(String[] args) {
		
	    System.out.println("Hi");
		M1(); // call from same class 
		M2();
		System.out.println("Hello....");
		Demo2.M3();     // call from another class 
		Demo2.M4();     // call from another class
		Demo2.M3();
		Demo2.M4();
	}

	public static void M1()
	{
		
		System.out.println("Running static regular method M1");
		
		
	
	}
	   public static void M2()  {
		   
	      System.out.println("Running static regular method M2");
	}
}




