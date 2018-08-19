package oop.abstraction;

public interface Car { //open interface body
	
	public void start();
	
	public void stop();
	
	public void wheel();
	
	public static void fly() {
		System.out.println("Hello Car");
	}

}//close interface body
