package Method;

import java.security.PublicKey;

public class Demo3 {

	public static void main(String[] args) {
		
   System.out.println("Hi");

   System.out.println("Hello");
   
 // create object of class 
 // classname objectname = new classname();
   Demo3 s3 = new Demo3();  // object created
   
// method call
// objectname.methodname();
   s3.M5();                // non static form same class 
   s3.M5();
  }
     
	  public void M5() {            // non static regular method
	
	System.out.println("Running non static regular method M5 from same class");
	  
	  }


}
