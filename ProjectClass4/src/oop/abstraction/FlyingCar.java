package oop.abstraction;

public abstract class FlyingCar implements FlyingObject {

	public abstract void flyingFeatures();
	
	public void autoPilot() {
		System.out.println("This car has auto pilot features");
	}
	
}
