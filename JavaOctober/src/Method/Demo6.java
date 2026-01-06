package Method;

public class Demo6 {
    // method without parameter
	public static void main(String[] args) {
	//1.static method call from same class 
		m1();
	//2. call not static ..we have to create object for that
		
		Demo6 d5=new Demo6();
		d5.m2();
	// static call from diff class
		Demo7.m3();
	//non static call from diff class...create object for diff class name 
		Demo7 d7=new Demo7();
		d7.m4();
	}
	
	// static regular method >>>method without parameter
	public static void m1() {
	System.out.println("Running static method m1");
	
	}
	// non static regular >>>> without parameter
	public void m2() {
		
		System.out.println("Running static method m2");
	}
	}
